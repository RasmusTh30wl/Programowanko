## Zajęcia 12

---

Aplikacje takie jak WinDirStat i KDirStat służą do wizualizacji informacji o rozkładzie zajmowanego miejsca w katalogach. Napisz program mający zbliżoną funkcjonalność.

---

Zdefiniuj interfejs AbstractFilesystemEntry, którą będą implementowały klasy plików i katalogów, posiadający publiczne metody:

- size(), zwracająca rozmiar w bajtach,

- children(), zawierająca listę (List<AbstractFilesystemEntry>) podrzędnych obiektów FileEntry.

- name(), zwracający nazwę pliku/katalogu.

---

Interfejs ten implementuje klasa FileEntry, w taki sposób, że jego metoda size zwraca rozmiar pliku, a metoda children pustą listę.

Interfejs ten implementuje również klasa DirEntry, w taki sposób, że jego metoda size zwraca sumę rozmiarów wszystkich plików w tym katalogu na wszystkich poziomach zagłębienia, a metoda children zwraca listę plików i katalogów znajdujących się na najbliższym poziomie zagłębienia.

Metoda name klasy DirEntry powinna zwracać nazwę katalogu otoczoną znakami [ ].

Informacja o podrzędnych katalogach i plikach w klasie DirEntry powinna być zapisana w postaci mapy, której kluczem jest nazwa pliku/katalogu, a wartością obiekt implementujący AbstractFilesystemEntry.

---

Napisz klasę, która jako argument konstruktora przyjmie ścieżkę katalogu nadrzędnego.

Klasa powinna utworzyć drzewiastą strukturę opartą o obiekty implementujące AbstractFilesystemEntry. Jej korzeniem powinien być obiekt DirEntry odpowiadający katalogowi podanemu argumentem konstruktora. W przypadku dużej liczby plików czas tworzenia takiej struktury może być długi, dlatego zadbaj, aby rozmiar każdego pliku został sprawdzony dokładnie raz.

---

Klasa powinna posiadać publiczną metodę przyjmującą ścieżkę względną w stosunku do katalogu nadrzędnego. Wywołanie tej metody powinno spowodować wyświetlenie listy plików/katalogów znajdujących się pod podaną ścieżką. W wierszu listy powinien znaleźć się udział rozmiaru pliku/katalogu w katalogu podanym ścieżką oraz jego nazwa (w przypadku katalogów otoczona [ ]). Udział należy podać procentowo z dokładnością do 2 miejsc po przecinku. Wpisy w liście powinny być posortowane malejąco według rozmiaru.

---

W statycznej metodzie main, funkcja ta powinna być wywoływana w pętli dla danych wpisanych ze standardowego wejścia, dopóki na standardowym wejściu nie pojawi się komenda “exit”.

---

W rozwiązaniu skorzystaj z metody list() lub walk() klasy java.nio.file.Files.

---
