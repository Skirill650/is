package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
jpr - название пакета */

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	
import javax.swing.*;
/*	Импортируем: 
javax.* — стандартные расширения.(Стандартные расширения (standard extensions) — это пакеты или наборы пакетов Java)
Swing - Библиотека графического интерфейса (конкретный пакет), В отличие от java.awt, javax.swing имеет более гибкую 
систему управления и более широкий набор функций
"*"-включение всех элементов библиотеки Swing (jbutton,jpanel,jlabel и т.д.)
"."(точка) используется для выделения элементов из ссылки на объект.
*/
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы
import javax.swing.event.TableModelEvent;

import javax.swing.table.DefaultTableModel;
public class index extends JFrame{
	/*	(Public) - поля и методы класса Index доступны для всех других объектов и классов. 
	зарезервированное слово class - говорит транслятору, что мы собираемся описать новый класс Index.
	Класс наследует функции элемента JFrame, который определён в стандартной библиотеке awt.
	 JFrame - само окно. JFrame содержит в себе всё необходимое для создания и функционирования окна программы - мы 
	 используем его методы в своей программе. { }-описание класса располагается между фигурными скобками. 
	*/

	private static final long serialVersionUID = 1L;
	public static index frame = new index(); /* Index() - это установка компонентов (панель вкладок) на JFrame. 
	(Public) - означает что фрейм Index можно вызвать из любого файла который лежит в пакете pack.
	static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса*/
	
	public static void main(String[] args) { /*  
		Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. 
		static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
		отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
		и переменным можно обращаться через имя класса.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/* public - модификатор доступа, означающий, что метод run() виден и доступен любому классу.
				void ()означает, что метод run не возвращает данных в программу, которая его вызвала, 
				а просто выводит на экран строку.
				Метод run с пустыми скобками, т.е. метод не имеет аргументов(параметров)	 
				*/
				try {
		/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
		Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
		доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
		 прерывается, и управление прыгает в начало блока catch(err).
		*/
					frame.setVisible(true); //устанавливаем что окно Index (Расчет расхода топлива) видно пользователю

				} catch (Exception e) {
					e.printStackTrace();
					/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
					Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
					Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
					1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
					доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
					 прерывается, и управление прыгает в начало блока catch(err).
					*/
				}
			}
		});
	}
	
	
	private JPanel panel, panel1,panel2;//панели на которых располагаются поля и кнопки. Панели доступны только для данного класса (private)
	private JButton del_1,del_2,del_3,del_4,del_5,calc;// кнопка Рассчитать которая доступна только для данного класса
	private JLabel label_0,label_n,label_n1,label_1,label_2,label_3,label_4,label_5,label_6,label_7,label_8,label_9,
	label_10,label_11,itog,size_1,h_cell_1,a_cell_1,b_cell_1,kol_cell_st_1,stor_1,
	size_2,h_cell_2,a_cell_2,b_cell_2,kol_cell_st_2,stor_2,
	size_3,h_cell_3,a_cell_3,b_cell_3,kol_cell_st_3,stor_3,
	size_4,h_cell_4,a_cell_4,b_cell_4,kol_cell_st_4,stor_4,
	size_5,h_cell_5,a_cell_5,b_cell_5,kol_cell_st_5,stor_5;
	// компонент на котором располагается текст
	public static JTextField h_1,a_1,b_1,kol_1,kol_cell_1,
	h_2,a_2,b_2,kol_2,kol_cell_2,
	h_3,a_3,b_3,kol_3,kol_cell_3,
	h_4,a_4,b_4,kol_4,kol_cell_4,
	h_5,a_5,b_5,kol_5,kol_cell_5;
	/* текстовые поля в которые пользователь вводит данные, доступны для любого файла из пакета pack */
	public static JCheckBox check_1,check_2,check_3,check_4,check_5;// компонент флажок
	public static int int_1=1,int_2=0, int_3=0, int_4=0, int_5=0, int_6=0;

	public index() { /*Модификатор доступа public означает, что метод Index()виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.
		Index - расположение на фрейме компонентов (панель вкладок), .*/
		setTitle("Расчет места хранения"); //устанавливает название окна 
		setSize(900, 470); // указывает ширину и высоту.
		setLocationRelativeTo(null);//установить посередине экрана
		
		//по закрытию формы - закрывать приложение
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout (new BorderLayout()); /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/
		panel = new JPanel();//Панель на которой располагается текст
        panel1 = new JPanel();//Панель на которой  располагаются текстовые поля и поля для ввода текста
		panel2 = new JPanel();//Панель на которой располагается кнопка
		add(panel, BorderLayout.NORTH);//Добавление панели panel сверху
		add(panel1, BorderLayout.CENTER);//Добавление панели panel1 по центру
		add(panel2, BorderLayout.SOUTH);//Добавление панели panel2 снизу

		panel.setBorder(new EmptyBorder(10,10,10,10));//установка внутренних отступов(сверху,слева,снизу,справа)
		panel1.setBorder(new EmptyBorder(10,10,10,10));//установка внутренних отступов(сверху,слева,снизу,справа)
		panel2.setBorder(new EmptyBorder(10,10,10,10));//установка внутренних отступов(сверху,слева,снизу,справа)

		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в 
		 * таблицу */
		panel.setLayout(new GridLayout(1,2,20,0));//на панели 1 строка,2столбца, будет расположен текст
		panel1.setLayout(new GridLayout(13,6,15,2));/* на панели 12 строк,6столб,15 - расстояние между столбцами,  0- между строками  */
		panel2.setLayout(new GridLayout(1,1));//на панели 1 строка,1столбец, будет расположена кнопка

		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.CENTER - выравнивание по центру
		*/
		label_0 = new JLabel("Всего места на стеллажах, куб.м.:", JLabel.RIGHT);
		label_1 = new JLabel("Высота стеллажа, см", JLabel.LEFT);
		label_2 = new JLabel("Ширина стеллажа, см", JLabel.LEFT);
		label_3 = new JLabel("Глубина стеллажа, см", JLabel.LEFT);
		label_4 = new JLabel("Количество ярусов", JLabel.LEFT);
		label_5 = new JLabel("Кол-во ячеек на ярусе", JLabel.LEFT);
		label_6 = new JLabel("Размер ячейки:", JLabel.LEFT);
		label_7 = new JLabel("      Высота, см", JLabel.LEFT);
		label_8 = new JLabel("      Ширина, см", JLabel.LEFT);
		label_9 = new JLabel("      Глубина, см", JLabel.LEFT);
		label_10 = new JLabel("Количество ячеек", JLabel.LEFT);
		label_11 = new JLabel("Доступно места, куб.м.", JLabel.LEFT);

		itog = new JLabel("0", JLabel.LEFT);
		label_n = new JLabel("", JLabel.CENTER);
		label_n1 = new JLabel("", JLabel.CENTER);
		size_1 = new JLabel("", JLabel.CENTER);
		h_cell_1 = new JLabel("", JLabel.CENTER);
		a_cell_1 = new JLabel("", JLabel.CENTER);
		b_cell_1 = new JLabel("", JLabel.CENTER);
		kol_cell_st_1 = new JLabel("", JLabel.CENTER);
		stor_1 = new JLabel("", JLabel.CENTER);

		size_2 = new JLabel("", JLabel.CENTER);
		h_cell_2 = new JLabel("", JLabel.CENTER);
		a_cell_2 = new JLabel("", JLabel.CENTER);
		b_cell_2 = new JLabel("", JLabel.CENTER);
		kol_cell_st_2 = new JLabel("", JLabel.CENTER);
		stor_2 = new JLabel("", JLabel.CENTER);

		size_3 = new JLabel("", JLabel.CENTER);
		h_cell_3 = new JLabel("", JLabel.CENTER);
		a_cell_3 = new JLabel("", JLabel.CENTER);
		b_cell_3 = new JLabel("", JLabel.CENTER);
		kol_cell_st_3 = new JLabel("", JLabel.CENTER);
		stor_3 = new JLabel("", JLabel.CENTER);

		size_4 = new JLabel("", JLabel.CENTER);
		h_cell_4 = new JLabel("", JLabel.CENTER);
		a_cell_4 = new JLabel("", JLabel.CENTER);
		b_cell_4 = new JLabel("", JLabel.CENTER);
		kol_cell_st_4 = new JLabel("", JLabel.CENTER);
		stor_4 = new JLabel("", JLabel.CENTER);

		size_5 = new JLabel("", JLabel.CENTER);
		h_cell_5 = new JLabel("", JLabel.CENTER);
		a_cell_5 = new JLabel("", JLabel.CENTER);
		b_cell_5 = new JLabel("", JLabel.CENTER);
		kol_cell_st_5 = new JLabel("", JLabel.CENTER);
		stor_5 = new JLabel("", JLabel.CENTER);
		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.CENTER - выравнивание по центру
		*/
		
		label_11.setForeground(Color.BLUE); 
		label_0.setForeground(Color.BLUE); 
		itog.setForeground(Color.BLUE); 
		stor_1.setForeground(Color.BLUE); 
		stor_2.setForeground(Color.BLUE); 
		stor_3.setForeground(Color.BLUE); 
		stor_4.setForeground(Color.BLUE); 
		stor_5.setForeground(Color.BLUE); 

		del_1 = new JButton("Очистить"); //В скобках - надпись на кнопке
		del_2 = new JButton("Очистить");
		del_3 = new JButton("Очистить");
		del_4 = new JButton("Очистить");
		del_5 = new JButton("Очистить");		
		calc = new JButton("Рассчитать"); 

		h_1 = new JTextField(); 
		a_1 = new JTextField(); 
		b_1 = new JTextField(); 
		kol_1 = new JTextField(); 
		kol_cell_1 = new JTextField(); 
		
		h_2 = new JTextField(); 
		a_2 = new JTextField(); 
		b_2 = new JTextField(); 
		kol_2 = new JTextField(); 
		kol_cell_2 = new JTextField(); 

		h_3 = new JTextField(); 
		a_3 = new JTextField(); 
		b_3 = new JTextField(); 
		kol_3 = new JTextField(); 
		kol_cell_3 = new JTextField(); 

		h_4 = new JTextField(); 
		a_4 = new JTextField(); 
		b_4 = new JTextField(); 
		kol_4 = new JTextField(); 
		kol_cell_4 = new JTextField(); 

		h_5 = new JTextField(); 
		a_5 = new JTextField(); 
		b_5 = new JTextField(); 
		kol_5 = new JTextField(); 
		kol_cell_5 = new JTextField(); 
		  
		//выравнивание текста по центру
		h_1.setHorizontalAlignment(JTextField.CENTER); 
		a_1.setHorizontalAlignment(JTextField.CENTER); 
		b_1.setHorizontalAlignment(JTextField.CENTER); 
		kol_1.setHorizontalAlignment(JTextField.CENTER); 
		kol_cell_1.setHorizontalAlignment(JTextField.CENTER); 
		
		h_2.setHorizontalAlignment(JTextField.CENTER); 
		a_2.setHorizontalAlignment(JTextField.CENTER); 
		b_2.setHorizontalAlignment(JTextField.CENTER); 
		kol_2.setHorizontalAlignment(JTextField.CENTER); 
		kol_cell_2.setHorizontalAlignment(JTextField.CENTER); 
		
		h_3.setHorizontalAlignment(JTextField.CENTER); 
		a_3.setHorizontalAlignment(JTextField.CENTER); 
		b_3.setHorizontalAlignment(JTextField.CENTER); 
		kol_3.setHorizontalAlignment(JTextField.CENTER); 
		kol_cell_3.setHorizontalAlignment(JTextField.CENTER); 
		
		h_4.setHorizontalAlignment(JTextField.CENTER); 
		a_4.setHorizontalAlignment(JTextField.CENTER); 
		b_4.setHorizontalAlignment(JTextField.CENTER); 
		kol_4.setHorizontalAlignment(JTextField.CENTER); 
		kol_cell_4.setHorizontalAlignment(JTextField.CENTER); 
		
		h_5.setHorizontalAlignment(JTextField.CENTER); 
		a_5.setHorizontalAlignment(JTextField.CENTER); 
		b_5.setHorizontalAlignment(JTextField.CENTER); 
		kol_5.setHorizontalAlignment(JTextField.CENTER); 
		kol_cell_5.setHorizontalAlignment(JTextField.CENTER);
		//выравнивание текста по центру

		//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		h_1.setMargin(new Insets(2, 5, 2, 5));
		a_1.setMargin(new Insets(2, 5, 2, 5));
		b_1.setMargin(new Insets(2, 5, 2, 5));
		kol_1.setMargin(new Insets(2, 5, 2, 5));
		kol_cell_1.setMargin(new Insets(2, 5, 2, 5));
