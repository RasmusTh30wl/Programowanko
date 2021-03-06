## Zajęcia 6

#### Zadanie 1.

Napisz program, który przyjmie od użytkownika napis i zapisze go w obiekcie klasy String. Wyświetl najwcześniejszą i najpóźniejsza literę alfabetu, która znajduje się w tym napisie.

---

#### Zadanie 2.

Napisz program, który pobierze od użytkownika trzy napisy. Pierwszy z nich powinien zawierać wyrazy - ciągi znaków oddzielone pojedynczą spacją, drugi i trzeci pojedynczy wyraz. Jeżeli w pierwszym napisie znajduje się wyraz z drugiego napisu, powinien on zostać zastąpiony wyrazem z trzeciego napisu. Po wykonaniu operacji zmieniony pierwszy napis należy wyświetlić.

---

#### Zadanie 3. 

Napisz program, który w napisie składającym się z wielu słów oddzielonych spacjami znajdzie najwcześniejsze alfabetycznie słowo. Skorzystaj z klasy StringTokenizer.

---

#### Zadanie 3a.

Zmień program, tak aby działa dla napisu składającego się z wielu wyrazów oddzielonych przecinkami.

---

#### Zadanie 4. 

Napisz program, który sprawdzi poprawność odwołania do komórki tablicy.

---

#### Zadanie 5.

Utwórz klasę Room modelującą prostopadłościenny pokój z drzwiami posiadającą prywatne, zmiennoprzecinkowe wymiary:

pokoju: długość, szerokość i wysokość,

drzwi: wysokość i szerokość. 

Utwórz klasę House posiadającą tablicę obiektów klasy Room. Konstruktor klasy House przyjmuje tablicę pokojów. W House zdefiniuj metodę umożliwiającą na dostęp do komórki tablicy obiektów klasy Room dla zadanego, całkowitego indeksu. Jeżeli indeks odwoła się do elementu spoza tablicy pokojów, metoda powinna rzucić wyjątek.

---

#### Zadanie 6.

Zdefiniuj konstruktor klasy Room przyjmujący wszystkie 5 jego parametrów. Zakładamy, że drzwi są umieszczone na ścianie zdefiniowanej szerokością pokoju. Jeżeli wymiary drzwi przekraczają szerokość lub wysokość pokoju należy rzucić wyjątek klasy OversizedDoorException dziedziczącej po Exception. Klasa powinna posiadać dwie zmienne odpowiadające wymiarom - szerokości i wysokości. W obiekcie rzucanym wyjątkiem należy umieścić informację o ile jednostek wymiar drzwi przekroczył wymiar pokoju. Należy również nadpisać metodę getMessage() tak, aby zwracała w postaci napisu informację o tych wymiarach.

---

#### Zadanie 7.

Zdefiniuj w klasie Room prywatne pole określające jego wolną powierzchnię. Dodaj do Room również publiczną metodę modelującą ustawienie prostopadłościennego mebla w pokoju, przyjmującą jego 3 zmiennoprzecinkowe wymiary: długość, szerokość i wysokość. Metoda powinna odjąć pole podstawy mebla od wolnej powierzchni pokoju oraz zwrócić prawdę, jeżeli można zmieścić ten mebel, albo nic nie odejmować i zwrócić fałsz, jeżeli w pokoju nie będzie wystarczająco dużo wolnego miejsca (nie musimy zagłębiać się w dokładne ustawienie - wystarczy sprawdzenie pola określającego wolną powierzchnię).

Zdefiniuj klasę FurnitureException, dziedziczącą po Exception. Zdefiniuj klasy FurnitureDoorException i FurnitureRoomException dziedziczące po FurnitureException. FurnitureDoorException powinien zostać rzucony, gdy mebel nie przejdzie przez drzwi, a FurnitureRoomException, gdy przejdzie przez drzwi, ale którykolwiek z jego wymiarów będzie przekraczał odpowiedni wymiar pokoju.

---
