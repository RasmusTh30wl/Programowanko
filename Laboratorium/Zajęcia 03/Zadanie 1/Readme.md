#### Zadanie 1.

Napisz klasę abstrakcyjną RegularPolyhedron modelującą bryłę posiadającą wielokąt foremny w podstawie. Ma ona posiadać:

- prywatne, zmiennoprzecinkowe zmienne określające długość boku podstawy, pole podstawy, wysokość bryły oraz prywatną, całkowitą zmienną określającą ilość boków postawy,
- publiczny konstruktor, przyjmujący w argumentach trzy wartości – długość boku, ilość boków i wysokość, dodatkowo obliczający wartość pola podstawy,
- chronione gettery do pola podstawy i wysokości,
- abstrakcyjną, bezargumentową metodę volume zwracającą wartość zmiennoprzecinkową będącą objętością bryły.

Napisz dziedziczące po niej publicznie dwie klasy: RegularPrism i RegularPyramid. Pierwsza z nich ma implementować metodę volume, tak aby zwracała objętość graniastosłupa foremnego, druga – ostrosłupa foremnego. 
