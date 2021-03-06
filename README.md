На изображниях ниже (для каждого варианта свое) приводится часть координатной плоскости (−10 ≤ x ≤ 10, −10 ≤ y ≤ 10) с графиками функций (парабола, линия) и фигурами (круг, прямоугольник). Размер одной клетки сетки – 1 (единица). Таким образом параметры функций и фигур можно однозначно определить из рисунка.

Области, на которые разбивается плоскость графиками и контурами фигур, закрашены разными цветами (белый, серый, желтый, оранжевый, голубой, зеленый). Необходимо реализовать программу, которая для точки (x, y) определяет цвет области, в которую данная точка попадает. Будем считать, что если точка (x, y) попадает на линию графика функции или контура фигуры, то правильным ответом будет цвет любой соседней области. Также стоит заметить, что некоторые комбинации линий предполагают их пересечение за пределами изображенного на рисунке фрагмента плоскости, поэтому, чтобы исключить неопределенность ответа, допустимыми значениями (x, y) являются только такие, которые попадают в приведенное изображение.

В программе должна быть реализована следующая функция (статический метод), которая для точки (x, y) возвращает цвет точки на изображении: getColor

![image](https://user-images.githubusercontent.com/90614965/141085290-45c33119-577b-41f3-b012-d4a2b6d605ba.png)
