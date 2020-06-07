## Zajęcia 13

Powtórzenie 

---

#### Zadanie 1.

Napisz klasę, zawierającą:

- prywatną listę liczb całkowitych,

- metodę add(), przyjmującą liczbę całkowitą jako argument i dodającą ją na koniec listy,

- metodę average(), obliczającą i zwracającą średnią z wartości przechowywanych na liście.

---

Napisz krótki program demonstrujący działanie klasy.

---

#### Zadanie 2. 

Napisz szablon metody statycznej addToEveryElement() (posiadającej argument szablonowy - typ T). Metoda powinna przyjmować dwa argumenty:

- wektor wartości typu T,

- wartość typu T, która zostanie dodana do każdego elementu wektora (modyfikując zawartość kontenera).

---

Napisz krótki program demonstrujący działanie metody.

---

#### Zadanie 3.

Zdefiniuj klasę AbstractBook, która posiada konstruktor przyjmujący ścieżkę do pliku tekstowego. Zakładamy, że w tym pliku znajduje się cała treść książki. Dostęp obiektu klasy do pliku można zrealizować dowolnie.

---

Zdefiniuj publiczną wirtualną metodę page(), która przyjmie jako argument numer strony, a zwróci obiekt typu string zawierający dane ze strony.

---

Zdefiniuj klasy BookA4 oraz BookB5, dziedziczące po AbstractBook. Klasy te powinny implementować metodę page() w taki sposób, aby zwrócić fragment pliku odpowiadający stronie, indeksując od 1. Na stronie w formacie A4 znajduje się 4972 znaków, a na stronie w formacie B5 3838. Podział na słowa należy zignorować. Jeżeli zwracana (ostatnia) strona jest niepełna, należy zwrócić odpowiednio mniej znaków. Jeżeli strona jest niepoprawna, należy zwrócić pusty napis.

---

Np. dla obiektu klasy BookA4 wywołanie page(1) powinno zwrócić napis ze znaków 0-4971, a page(2) ze znaków 4972-9943.

---
