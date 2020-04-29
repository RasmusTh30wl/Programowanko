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
