Zadanie 1.

Zdefiniuj interfejs służący do obsługi sklepu posiadający metody:

A) przyjmującą liczbę całkowitą i zwracającą napis będący opisem zamówienia,

B) bezargumentową, zwracającą liczbę zmiennoprzecinkową będącą całkowitą wartością towaru danego typu w sklepie,

C) przyjmującą  całkowitą i zwracającą liczbę logiczną modelująca sprzedaż

 

Zadanie 2.

Napisz abstrakcyjną klasę Product, reprezentującą produkty sklepowe,  implementującą powyższy interfejs. Klasa ma posiadać:

- chronione pola odpowiedniego typu: nazwę produktu, cenę netto, cenę brutto, podatek od produktu, marżę sklepu na dany produkt oraz ilość towaru dostępną w sklepie,
- konstruktor przypisujący nazwę, cenę netto oraz ilość.
- implementacja metody B) obliczającej całkowitą wartość towaru (cena brutto zwielokrotniona o ilość produktu)
- implementacja metody C). Jeżeli argument funkcji jest mniejszy bądź równy ilości danego produktu następuje sprzedaż.



Zadanie 3.

Zdefiniuj klasę Bread, dziedziczącą po klasie Product. Konstruktor klasy Bread powinien przypisać wartość podatku (5%), marżę sklepu (np. 10%) oraz wyliczyć cenę uwzględniając wszystkie obciążenia. Ponadto, klasa powinna implementować metodę A). Jeżeli ilość towaru spada poniżej poziomu określonego w argumencie, metoda zwraca napis składający się z nazwy brakującego towaru oraz nazwy dostawcy (np. “piekarnia”). W przeciwnym przypadku zwraca pusty napis.

 

Zadanie 4. 

Zdefiniuj kilka kolejnych klas dziedziczących po klasie Product, np. Milk oraz Book. Zdefiniuj metody potrzebne do działania klasy. Samodzielnie wymyśl wartości ustawione polom.

 

Zadanie 5.

Napisz metodę statyczną klasy Product przyjmującą w argumencie tablicę produktów i  obliczającą całkowitą jego wartość korzystając z metody B.

 

Zadanie 6.

W metodzie main utwórz tablicę produktów. Do komórek tablicy przypisz różne produkty.

- utwórz listę brakujących towarów korzystając z metody A,
- oblicz wartość całego sklepu,
- dokonaj sprzedaży każdego z produktów.
