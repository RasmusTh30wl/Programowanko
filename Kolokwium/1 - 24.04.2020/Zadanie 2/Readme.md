#### Zadanie 2.

Zdefiniuj abstrakcyjną klasę modelującą papiery wartościowe. Klasa powinna posiadać:

- prywatne pole typu float - wartość;

- prywatne pole typu int - id;

- potrzebne akcesory;

- konstruktor;

- publiczną abstrakcyjną bezargumentową metodę step; 

Następnie zaimplementuj dwie klasy dziedziczące po papierach wartościowych:

- obligacje:

  - posiadającą pole oprocentowanie oraz implementacje metody step (w każdym kroku dodajemy odsetki do wartości);

- akcje:

  - implementacje metody step (ceny akcji mogą zwiększyć się o 10% lub zmniejszyć się o 10%. Korzystając z klasy Random zaproponuj losowanie wybierające wzrost lub spadek ceny).

Napisz klasę reprezentującą portfel papierów wartościowych. Klasa składa się z:

- prywatnej tablicy papierów wartościowych,

- konstruktora, dostającego w argumencie powyższą tablicę,

- publicznej bezargumentowej metody step - wykonującej krok dla każdego instrumentu w portfelu,

- publicznej bezargumentowej metody zwracającej wartości całego portfela.

Utwórz obiekt klasy portfel, a następnie wyświetl jego koszt po jednym kroku.
