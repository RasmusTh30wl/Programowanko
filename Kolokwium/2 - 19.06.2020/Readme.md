## KOLOKWIUM 2
Informacje:

Na rozwiązanie mają Państwo 3 godziny. Po upływie czasu nie będzie możliwości przesłania rozwiązań. Zadania należy rozwiązać samodzielnie. Rozwiązania będą sprawdzane również pod kątem plagiatu.

 

Zdefiniuj klasę Person posiadającą publiczne metody:

- name, zwracającą imię i nazwisko oddzielone spacją,

- birth, zwracającą datę urodzenia,

- death, zwracającą datę śmierci (null, gdy żyje).

 

Dany jest katalog zawierający pliki tekstowe. Każdy z plików opisuje jedną osobę. W każdym pliku kolejne wiersze zawierają:

- imię i nazwisko oddzielone spacją,

- datę urodzenia w formacie dd.MM.yyyy,

- (opcjonalnie) datę śmierci w formacie dd.MM.yyyy,

- (opcjonalnie) napis “Rodzice:”

- (co najwyżej dwa wiersze) imię i nazwisko rodzica oddzielone spacją,

- (opcjonalnie) napis “Dzieci:”

- (dowolna liczba wierszy) imię i nazwisko dziecka oddzielone spacją.

W przypadku, gdy osoba nie ma wpisanych rodziców, wiersz “Rodzice:” nie pojawia się.

Analogicznie, w przypadku, gdy osoba nie ma dzieci, wiersz “Dzieci:” także nie pojawia się. Zakładamy, że nadane w chwili narodzin imiona i nazwiska są niezmienne przez całe życie.

 

Aby dane w plikach mogły być dalej analizowane powinny spełnić następujące warunki. Brak spełnienia dowolnego z nich powinien skutkować rzuceniem stosowanego wyjątku.

Zdefiniuj 4 wyjątki dziedziczące po RuntimeException, po jednym dla każdego z warunków. Definicje wszystkich wyjątków umieść w jednym pliku.

 

Warunek 1:

Niedopuszczalne jest istnienie wielu osób o tym samym imieniu i nazwisku.

Wyjątek AmbigiousPersonException, powinien posiadać 2 metody zwracającą ścieżki plików definiujących tę samą osobę.

 

Warunek 2:

Jeżeli osoba jest podana jako dziecko lub rodzic innej osoby. Musi posiadać swój własny plik.

Wyjątek UndefinedPersonReferenceException, powinien posiadać metodę zwracającą ścieżkę do pliku, w którym pojawiła się osoba (jako rodzic lub dziecko) nie posiadające własnego pliku oraz metodę zwracającą imię i nazwisko tej osoby.

 

Warunek 3:

Dane są spójne - jeżeli w pliku rodzica pojawia się dziecko, w pliku dziecka musi być wskazanie na tego rodzica.

Wyjątek ParentChildInconsistencyException, powinien posiadać metody zwracające ścieżki do pliku rodzica oraz pliku dziecka, w których doszło do niespójności.

 

Warunek 4:

Osoba będąca rodzicem dziecka powinna być od niego starsza o co najmniej 10 lat, ale nie starsza niż 100 lat. Zakładamy także, że dziecko nie może urodzić się po śmierci rodzica. Wyjątek ParentingAgeException, powinien posiadać metody zwracające ścieżki do pliku rodzica oraz pliku dziecka, w których doszło do niespójności.

 

Zakładamy, że pod wszystkimi innymi, niewymienionymi tu warunkami dane w plikach są poprawne, m.in. pliki mają poprawny format, data urodzenia jest wcześniejsza niż data śmierci, imiona i nazwiska w liście rodziców i dzieci wskazują na inne osoby, co najwyżej 2 rodziców.

 

Napisz klasę posiadającą metody publiczne:

- populate, która otrzyma jako argument ścieżkę do katalogu i utworzy strukturę danych (do samodzielnego zaprojektowania) do zapisu potrzebnych informacji i przeniesie tam dane z plików.
Metoda powinna rzucić jeden z wypisanych wcześniej wyjątków, jeżeli dane nie spełnią odpowiadającego mu warunku. Obsługa każdego z wyjątków powinna polegać na wyświetleniu na standardowym wyjściu błędów wszystkich wartości zwracanych przez zdefiniowane w wyjątkach metody.

- getPerson, która otrzyma jako argument napis zawierający imię i nazwisko osoby, a zwróci odpowiadający mu obiekt Person. Jeżeli nie ma takiej osoby, należy zwrócić null.

 

GRUPA A - STUDENCI O NAZWISKU ROZPOCZYNAJĄCYM SIĘ NA A-L

- descendants, która otrzyma jako argument obiekt Person, a zwróci listę list obiektów Person. Lista powinna zawierać w kolejnych węzłach: listę dzieci, listę wnuków, listę prawnuków itd. przekazanej argumentem osoby, o ile tacy zstępni istnieją.

- showDescendands - metoda statyczna, która przyjmuje listę list zwróconą przez descendands i wyświetla ją w postaci kolejnych wierszy zawierających imiona i nazwiska osób, o ile znajdują się one w liście, każdy z wierszy należy rozpocząć odpowiednim nagłówkiem: dzieci, wnukowie, prawnukowie, praprawnukowie itd.

 

GRUPA B - STUDENCI O NAZWISKU ROZPOCZYNAJĄCYM SIĘ NA M-Ż

- ancestors, która otrzyma jako argument obiekt Person, a zwróci listę list obiektów Person. Lista powinna zawierać w kolejnych węzłach: listę rodziców, listę dziadków, listę pradziadków itd. przekazanej argumentem osoby, o ile tacy wstępni istnieją. 

- showAncestors - metoda statyczna, która przyjmuje listę list zwróconą przez ancestors i wyświetla ją w postaci kolejnych wierszy zawierających imiona i nazwiska osób, o ile znajdują się one w liście, każdy z wierszy należy rozpocząć odpowiednim nagłówkiem: rodzice, dziadkowie, pradziadkowie, prapradziadkowie itd.

 

Przetestuj działanie wszystkich napisanych metod.

 

Przykład:

Udostępnione zostały pliki p1 - p11.txt oraz warunek1 - warunek4.txt.

Sprawdzenie poprawnego działania - w katalogu powinny znajdować się pliki p1 - p11.txt

Sprawdzenie warunku 1 -  pliki p1 - p11.txt oraz warunek1.txt

Sprawdzenie warunku 2 -  pliki p1 - p10.txt oraz warunek2.txt

Sprawdzenie warunku 3 -  pliki p1 - p10.txt oraz warunek3.txt

Sprawdzenie warunku 4 -  pliki p1 - p10.txt oraz warunek4.txt

 

Poprawny wynik showDescendands() dla osoby “Marek Głaz”:

dzieci: Ewelina Dąbrowska, Euzebiusz Głaz, Krystyna Dąbrowska

wnuki: Alicja Stefanek, Tomasz Dąbrowski, Joanna Nowak, Kacper Głaz

prawnuki: Elżbieta Głaz, Eryk Głaz

 

Poprawny wynik showAncestors() dla osoby “Eryk Głaz”:

rodzice: Kacper Głaz

dziadkowie: Euzebiusz Głaz

pradziadkowie: Ewa Głaz, Marek Głaz
