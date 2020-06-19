package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.*;


class Patient {
    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                "}";
    }

    public String name;
    public String lastName;
    public float temp1, temp2;
    public Patient(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Patient(LocalDate day, String name, String lastName, float temp1, float temp2) {
        this.name = name;
        this.lastName = lastName;
        this.temp1=temp1;
        this.temp2=temp2;
    }
    public Patient(String name, String lastName, float temp1, float temp2) {
        this.name = name;
        this.lastName = lastName;
        this.temp1=temp1;
        this.temp2=temp2;
    }
}

class Day {
    public LocalDate date = null;
    public List<Patient> patients = new ArrayList<>();

    public Day(LocalDate date) {
        this.date = date;
    }

    public Day() {

    }

    public LocalDate getDate() {
        return date;
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void showPatients() {
        for (Patient patient : patients)
            System.out.println(patient.toString());
    }

    @Override
    public String toString() {
        return "Day{" +
                "date=" + date +
                ", patients=" + patients +
                '}';
    }
}

class DataRecovery {
    public List<Day> recursionRollback;
    public List<Day> result=new ArrayList<>();

    public boolean populate(String folderName) throws FileNotFoundException {
        File directory = new File(folderName);
        File[] children = directory.listFiles();
        boolean isOk = true;
        List<Day> correct = new ArrayList<>();
        List<Day> incorrect = new ArrayList<>();
        String line, name, lastName;
        float temp1, temp2;
        //podział pacjentów na dwie listy:
        for (File child : children) {
            if (child.isFile()) {
                //z poprawnymi datami
                try {
                    LocalDate d = LocalDate.parse(child.getName(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    Day day = new Day(d);
                    File file = new File(child.toString());
                    Scanner in = new Scanner(file);
                    do {
                        line = in.nextLine();
                        StringTokenizer tokenizer = new StringTokenizer(line, " ");
                        name = tokenizer.nextToken();
                        lastName = tokenizer.nextToken();
                        temp1 = Float.parseFloat(tokenizer.nextToken());
                        temp2 = Float.parseFloat(tokenizer.nextToken());
                        day.addPatient(new Patient(d,name, lastName, temp1, temp2));
                    } while (in.hasNext());
                    correct.add(day);
                }
                //bez poprawnej daty
                catch (DateTimeParseException | FileNotFoundException ex) {
                    isOk = false;
                    Day day = new Day();
                    File file = new File(child.toString());
                    Scanner in = new Scanner(file);

                    do {
                        line = in.nextLine();
                        StringTokenizer tokenizer = new StringTokenizer(line, " ");
                        name = tokenizer.nextToken();
                        lastName = tokenizer.nextToken();
                        temp1 = Float.parseFloat(tokenizer.nextToken());
                        temp2 = Float.parseFloat(tokenizer.nextToken());
                        day.addPatient(new Patient(name, lastName, temp1, temp2));
                    } while (in.hasNext());
                    incorrect.add(day);
                }

            }
        }
        //sprawdzenie tablic
//        System.out.println("Correct");
//        for (int i = 0; i < correct.size(); i++) {
//            System.out.println(correct.get(i));
//        }
//        System.out.println("Incorrect");
//        for (int i = 0; i < incorrect.size(); i++) {
//            System.out.println(incorrect.get(i));
//        }
        //Jeżeli nie udało się odczytać wszystkich dat
        if (!isOk) {
            for (int i = 0; i < correct.size() - 1; i++) {
                //jeżeli mamy więcej niż jeden dzień między odnależionymi datami
                int daysBetween = (int) ChronoUnit.DAYS.between(correct.get(i).getDate(), correct.get(i + 1).getDate()) - 1;
                if(daysBetween > 0) {
                    if (checkForNeighbourhood(correct.get(i), correct.get(i + 1), new ArrayList<Day>(incorrect), daysBetween)) {
                        int rRoll = 1;
                        for(Day day : recursionRollback) {
                            day.date =  LocalDate.from(correct.get(i).date).plusDays(rRoll++);
                        }
                        correct.addAll(i+1, recursionRollback);
                        incorrect.removeAll(recursionRollback);
                        i+=recursionRollback.size();
                    }
                }

            }
        }
        result.addAll(correct);
        return incorrect.isEmpty();
    }

    private boolean checkForNeighbourhood(Day referenceDay, Day referenceNext, List<Day> incorrect, int daysBetween) {

        if (daysBetween == 0) {
            if (canBeNeighbourDate(referenceDay, referenceNext)) {
                this.recursionRollback = new ArrayList<>();
                return true;
            } else return false;
        }
        else {
            for (Day testedDay : incorrect)
                if (canBeNeighbourDate(referenceDay, testedDay)) {
                    incorrect.remove(testedDay);
                    if(checkForNeighbourhood(testedDay, referenceNext, new ArrayList<Day>(incorrect), daysBetween - 1)) {
                        recursionRollback.add(0, testedDay);
                        return true;
                    }

                    //return result;
                }
            // nie udało się znaleźć dopasowania, a pozostały dni do wypełnienia
            return false;
        }

    }

    private boolean canBeNeighbourDate(Day reference, Day tested) {
        int counter = 0;
        for(Patient refPat :  reference.patients) {
            for(Patient testPat : tested.patients)
                if(refPat.name.equals(testPat.name) && refPat.lastName.equals(testPat.lastName))
                    counter++;
        }
        //System.out.println(reference.patients + " ||| " + tested.patients + "|||" +  (counter>0 && counter != reference.patients.size() && counter != tested.patients.size()));
        return counter>0 && counter != reference.patients.size() && counter != tested.patients.size();

    }


    public  void show(Patient patient) {
        for(Day day:result)
            for(Patient p: day.patients)
                if(p.name.equals(patient.name) && p.lastName.equals(patient.lastName)){
                    System.out.println(day.date+"\t"+ p.temp1+"\t"+p.temp2);
                }

    }



}


public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        DataRecovery dr = new DataRecovery();
        System.out.println(dr.populate("c:\\Users\\Beatka\\Documents\\Dydaktyka\\untitled5\\untitled5\\tmp"));
        dr.show(new Patient("c","c"));

    }
}
