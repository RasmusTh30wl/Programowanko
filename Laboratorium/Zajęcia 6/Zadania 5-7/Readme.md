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
