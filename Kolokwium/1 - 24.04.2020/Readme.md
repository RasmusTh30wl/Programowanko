#### Informacje:

Rozwiązanie każdego z zadań powinno stanowić oddzielny projekt. Rozwiązania wszystkich zadań należy ulokować w jednym katalogu nazwanym nazwiskiem i imieniem, katalog spakować i umieścić w polu wysyłania. Na rozwiązanie mają Państwo 3 godziny. Po upływie czasu nie będzie możliwości przesłania rozwiązań. Zadania należy rozwiązać samodzielnie. Rozwiązania będą sprawdzane również pod kątem plagiatu.

---

#### Zadanie 1.

Napisz klasę posiadającą prywatne pole typu String. Ponadto klasa powinna posiadać:

- konstruktor, przypisujący wartość pola,

- publiczną metodę przyjmująca w argumentach dwie zmienne typu char,  wysyłającą tekst z pola na standardowe wyjście w następujący sposób: w każdym słowie rozpoczynającym się znakiem będącym pierwszym argumentem  i kończącym się drugim argumentem (bez względu na ich wielkość) zostaną wyświetlone jedynie litery pierwsza i ostania, a pozostałe litery zostaną zamienione na “*”. 

Przykład: dla argumentów ‘a’, ‘a’

“Ala ma kota i aligatora” ->”A*a ma kota i a*******a”

- publiczną metodę wysyłającą tekst z pola na standardowe wyjście w następujący sposób: w każdym słowie pierwszą i ostatnią literę zamieniamy na dużą.

Przykład: 

“Ala ma kota i aligatora” -> “AlA MA KotA I AligatorA”

Zakładamy, że napis składa się jedynie z liter i spacji.

---

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

---

#### Zadanie 3.

Dane są dwa interfejsy

- ReadDevice posiadający publiczną, bezargumentową metodę read zwracającą String,

- WriteDevice posiadający publiczną, metodę write przyjmującą String, a zwracającą void.

 

Zamodeluj i zaimplementuj klasę Line, realizującą połączenie między dwoma modemami. Klasa Line powinna implementować interfejsy ReadDevice oraz WriteDevice. Wywołanie metody write jej obiektu zapisuje napis do pamięci linii oraz informuje modem docelowy o oczekującej wiadomości. Wywołanie metody read, powinno zwrócić zapisany napis.

 

Zaimplementuj klasę Modem posiadającą prywatne pola:

- readLine typu ReadDevice - linię wejściową,

- writeLine typu WriteDevice - linię wyjściową.

Obiekt Line będący urządzeniem wejściowym w jednym modemie, powinien być urządzeniem wyjściowym w drugim.

Klasa powinna posiadać również prywatną metodę:

- readMessage - bezargumentowa, odczytująca na standardowe wyjście napis z linii wejściowej za pomocą jej metody read,

oraz publiczne metody:

- connect, przyjmująca jako parametr inny obiekt klasy Modem, zestawiającą połączenie między modemami za pomocą dwóch nowo utworzonych obiektów klasy Line,

- writeMessage - przyjmująca napis, przekazująca go do linii wyjściowej za pomocą jej metody write,

- call - bezargumentowa, wywoływana przez obiekt Line, gdy oczekuje wiadomość dla modemu. Wywołanie tej metody, powinno skutkować wywołaniem metody readMessage.

 

W razie potrzeby, można dopisywać prywatne pola i metody obu klas. 

---

Podpowiedź: W klasie Line umieść obiekt Modem, którego metoda call będzie wywoływana.

---
