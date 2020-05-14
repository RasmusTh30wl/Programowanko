## Zajęcia 10

---

#### Zadanie 1a.

Zaprogramuj sumowanie zawartości tablicy z podziałem zadania na wątki. W tym celu napisz klasę ThreadedAdder  dziedziczącą po klasie Thread. Klasa powinna posiadać:

- konstruktor przyjmujący jako argument tablicę liczb całkowitych

- metodę run, która oblicza sumę elementów tej tablicy i zapisuje ją w prywatnym polu klasy,

- publiczną, statyczną metodę calculateSum, przyjmującą jako argument tablicę liczb całkowitych oraz liczbę wątków. Metoda powinna dla każdego wątku utworzyć obiekt klasy ThreadedAdder, którego konstruktorowi zostanie przekazany kolejny fragment tablicy zadanej argumentem, a następnie uruchomione zostanie sumowanie.
Należy zapewnić, że rozmiary fragmentów tablic przekazanych obiektom ThreadAdder nie będą różnić się o więcej niż 1 element. Jeżeli zadana liczba wątków będzie większa od rozmiaru tablicy, należy ograniczyć liczbę wątków do tego rozmiaru.

Napisz metodę statyczną main, w której zostanie wylosowana tablica liczb całkowitych. Zsumuj i wyświetl zawartość tej tablicy za pomocą metody calculateSum. Zewryfikuj otrzymany wynik za pomocą metody Stream.sum().

---

#### Zadanie 1b.

Napisz klasę analogiczną do TheadedAdder, której zadaniem będzie zapełnienie tablicy całkowitymi liczbami losowymi z podziałem na wątki. Zastąp napisane wcześniej zapełnianie tablicy, wywołaniem metody statycznej (odpowiednikiem calculateSum w nowej klasie).

---

#### Zadanie 2.

Napisz generyczny interfejs GenericMethod parametryzowany typem T. W interfejsie zdefiniuj metodę przyjmującą dwa obiekty typu T, a zwracającą obiekt typu T.

Napisz generyczną klasę ThreadedGeneric parametryzowaną typem T. Działanie klasy ThreadedGeneric powinno być zbliżone do ThreadedAdder - każdy z wątków powinien analizować fragment tablicy, przy czym zamiast sumowania, powinien wykonywać na nim jedyną metodę interfejsu GenericMethod. Pierwszym z jej argumentów powinien być wynik poprzedniego kroku, a drugim wartość w aktualnie analizowanej komórce tablicy.

Należąca do ThreadedGeneric statyczna metoda calculateMethod powinna przyjmować 4 argumenty: wartość początkową działania (typu T), tablicę obiektów typu T, obiekt typu GenericMethod oraz liczbę wątków, na które należy podzielić zadanie. Metoda powinna zlecić wykonanie działania na fragmentach tablicy wątkom.

 

Napisz klasy implementujące interfejs GenericMethod:

- IntegerAdderMethod - dzięki przekazaniu tej klasy w parametrze calculateMethod, powinna zwrócić sumę wartości komórek tablicy liczb całkowitych,

- FloatMaxMethod - dzięki przekazaniu tej klasy w parametrze calculateMethod, powinna zwrócić maksymalną wartość z tablicy liczb zmiennoprzecinkowych,

- AlphabeticallyFirst - dzięki przekazaniu tej klasy w parametrze calculateMethod, powinna zwrócić najwcześniejszy alfabetycznie napis z tablicy napisów.

 

Przetestuj ich działanie w metodzie main.


---

#### Zadanie 3.

Napisz metodę wykonującą mnożenie macierzy. Każdy wiersz macierzy powinien być analizowany przez osobny wątek.

---

#### Zadanie 4.

Napisz metodę szacującą liczbę π, jako proporcję między liczbą losowych punktów wewnątrz koła do liczby punktów wewnątrz opisanego na nim kwadratu.

Metoda powinna działać w dwóch trybach - jedno i wielowątkowym. Wybór trybu realizowany jest przez logiczny parametr metody. W przypadku trybu wielowątkowego, należy sprawdzić liczbę dostępnych rdzeni i utworzyć taką liczbę wątków.

Każdy wątek powinien przez 1 sekundę losować punkty, a następnie podać otrzymaną proporcję.

Porównaj dokładność trybu jedno i wielowątkowego.
