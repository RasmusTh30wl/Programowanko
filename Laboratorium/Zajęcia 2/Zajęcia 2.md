## Zajęcia 2

#### Zadanie 1.

Napisz klasę User posiadającą prywatne pola login i password typu string. Napisz konstruktor przyjmujący obie wartości. Napisz metodę authorize, która przyjmie w argumentach dwa napisy i sprawdzi, czy zgadzają się z polami w klasie. Napisz metodę print wypisującą login i password użytkownika.

---

#### Zadanie 2. 

Napisz klasę Teacher, która dziedziczy po klasie User, której prywatne pola należy zmienić na chronione. Teacher powinien mieć dodatkowe pole ustawiane w konstruktorze, określające jednostkę, w której pracuje. Napisz metodę print wypisującą login i password nauczyciela wykorzystując metodę print z klasy User.

---

#### Zadanie 3.

Napisz klasę Student, która dziedziczy po klasie User. Student powinien mieć dodatkowe pole określające semestr ustawiane z poziomu konstruktora. Napisz metodę wypisującą informacje o studencie wykorzystując metodę print z klasy User.

---

#### Zadanie 4.

Napisz klasę Subject posiadającą prywatne pole będące nazwą przedmiotu, maksymalną liczbę  studentów, nauczyciela prowadzącego oraz odpowiednio dużą tablicę obiektów typu Student - dwie pierwsze ustawiane z konstruktora. Powinna ona mieć logiczną metodę addStudent dodającą studenta do przedmiotu i zwracającą prawdę, jeżeli się to udało, albo fałsz kiedy nie ma już miejsc.

---

#### Zadanie 5.

Napisz metodę klasy Subject, która przyjmie numer albumu studenta oraz obiekt będący wraperem wartości logicznej. Jeżeli student o podanym indeksie znajduje się w tablicy przedmiotu, należy ustawić wartość logiczną z argumentu na true i zwrócić obiekt tego studenta. W przeciwnym razie należy ustawić fałsz i zwrócić dowolną wartość.

---

#### Zadanie 6.

Napisz konstruktor kopiujący klasy Subject, który usunie wszystkich studentów z wynikowego przedmiotu.

---

#### Zadanie 7. 

Napisz metodę statyczną klasy Subject, która przymie jako argumenty tablicę przedmiotów oraz obiekt studenta i zwróci tablicę przedmiotów, do których przypisany jest dany student.

---
