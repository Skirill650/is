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

		h_2.setMargin(new Insets(2, 5, 2, 5));
		a_2.setMargin(new Insets(2, 5, 2, 5));
		b_2.setMargin(new Insets(2, 5, 2, 5));
		kol_2.setMargin(new Insets(2, 5, 2, 5));
		kol_cell_2.setMargin(new Insets(2, 5, 2, 5));

		h_3.setMargin(new Insets(2, 5, 2, 5));
		a_3.setMargin(new Insets(2, 5, 2, 5));
		b_3.setMargin(new Insets(2, 5, 2, 5));
		kol_3.setMargin(new Insets(2, 5, 2, 5));
		kol_cell_3.setMargin(new Insets(2, 5, 2, 5));

		h_4.setMargin(new Insets(2, 5, 2, 5));
		a_4.setMargin(new Insets(2, 5, 2, 5));
		b_4.setMargin(new Insets(2, 5, 2, 5));
		kol_4.setMargin(new Insets(2, 5, 2, 5));
		kol_cell_4.setMargin(new Insets(2, 5, 2, 5));

		h_5.setMargin(new Insets(2, 5, 2, 5));
		a_5.setMargin(new Insets(2, 5, 2, 5));
		b_5.setMargin(new Insets(2, 5, 2, 5));
		kol_5.setMargin(new Insets(2, 5, 2, 5));
		kol_cell_5.setMargin(new Insets(2, 5, 2, 5));
		//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)

		//компонент флажок 
		check_1 = new JCheckBox("Стеллаж 1");
		check_2 = new JCheckBox("Стеллаж 2");
		check_3 = new JCheckBox("Стеллаж 3");
		check_4 = new JCheckBox("Стеллаж 4");
		check_5 = new JCheckBox("Стеллаж 5");
		check_1.setSelected(true);
		//выравнивание текста по центру
		check_1.setHorizontalAlignment(JCheckBox.CENTER); 
		check_2.setHorizontalAlignment(JCheckBox.CENTER); 
		check_3.setHorizontalAlignment(JCheckBox.CENTER); 
		check_4.setHorizontalAlignment(JCheckBox.CENTER); 
		check_5.setHorizontalAlignment(JCheckBox.CENTER); 

		//Добавление компонентов на панели panel
		panel.add(label_0);
		panel.add(itog);

		panel1.add(label_n);
		panel1.add(check_1);
		panel1.add(check_2);
		panel1.add(check_3);
		panel1.add(check_4);
		panel1.add(check_5);

		panel1.add(label_n1);
		panel1.add(del_1);
		panel1.add(del_2);
		panel1.add(del_3);
		panel1.add(del_4);
		panel1.add(del_5);
		
		panel1.add(label_1);
		panel1.add(h_1);
		panel1.add(h_2);
		panel1.add(h_3);
		panel1.add(h_4);
		panel1.add(h_5);
		
		panel1.add(label_2);
		panel1.add(a_1);
		panel1.add(a_2);
		panel1.add(a_3);
		panel1.add(a_4);
		panel1.add(a_5);
		
		panel1.add(label_3);
		panel1.add(b_1);
		panel1.add(b_2);
		panel1.add(b_3);
		panel1.add(b_4);
		panel1.add(b_5);		
		
		panel1.add(label_4);
		panel1.add(kol_1);
		panel1.add(kol_2);
		panel1.add(kol_3);
		panel1.add(kol_4);
		panel1.add(kol_5);
		
		panel1.add(label_5);
		panel1.add(kol_cell_1);
		panel1.add(kol_cell_2);
		panel1.add(kol_cell_3);
		panel1.add(kol_cell_4);
		panel1.add(kol_cell_5);
		
		panel1.add(label_6);
		panel1.add(size_1);
		panel1.add(size_2);
		panel1.add(size_3);
		panel1.add(size_4);
		panel1.add(size_5);

		panel1.add(label_7);
		panel1.add(h_cell_1);
		panel1.add(h_cell_2);
		panel1.add(h_cell_3);
		panel1.add(h_cell_4);
		panel1.add(h_cell_5);
		
		panel1.add(label_8);
		panel1.add(a_cell_1);
		panel1.add(a_cell_2);
		panel1.add(a_cell_3);
		panel1.add(a_cell_4);
		panel1.add(a_cell_5);
		
		panel1.add(label_9);
		panel1.add(b_cell_1);
		panel1.add(b_cell_2);
		panel1.add(b_cell_3);
		panel1.add(b_cell_4);
		panel1.add(b_cell_5);	
		
		panel1.add(label_10);
		panel1.add(kol_cell_st_1);
		panel1.add(kol_cell_st_2);
		panel1.add(kol_cell_st_3);
		panel1.add(kol_cell_st_4);
		panel1.add(kol_cell_st_5);	
		
		panel1.add(label_11);
		panel1.add(stor_1);
		panel1.add(stor_2);
		panel1.add(stor_3);
		panel1.add(stor_4);
		panel1.add(stor_5);	
		
		panel2.add(calc);

		//Если галочка у checkbox не стоит - поля для ввода в данном столбце недоступны
		del_2.setEnabled(false);
		h_2.setEditable(false);
		a_2.setEditable(false);
		b_2.setEditable(false);
		kol_2.setEditable(false);
		kol_cell_2.setEditable(false);
		
		del_3.setEnabled(false);
		h_3.setEditable(false);
		a_3.setEditable(false);
		b_3.setEditable(false);
		kol_3.setEditable(false);
		kol_cell_3.setEditable(false);
		
		del_4.setEnabled(false);
		h_4.setEditable(false);
		a_4.setEditable(false);
		b_4.setEditable(false);
		kol_4.setEditable(false);
		kol_cell_4.setEditable(false);
		
		del_5.setEnabled(false);
		h_5.setEditable(false);
		a_5.setEditable(false);
		b_5.setEditable(false);
		kol_5.setEditable(false);
		kol_cell_5.setEditable(false);
		
/*СТЕЛЛАЖ 1*/
		check_1.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==check_1)//если событие произошло именно с флажком check_, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то поля для ввода информации о стеллаже доступны  */
						int_1=1; //переменная которая отвечает за то что стеллаж доступен
						del_1.setEnabled(true);
						h_1.setEditable(true);
						a_1.setEditable(true);
						b_1.setEditable(true);
						kol_1.setEditable(true);
						kol_cell_1.setEditable(true);
						h_cell_1.setForeground(Color.BLACK); 
						a_cell_1.setForeground(Color.BLACK); 
						b_cell_1.setForeground(Color.BLACK); 
						kol_cell_st_1.setForeground(Color.BLACK); 
						stor_1.setForeground(Color.BLUE); 
						itog.setText("");
						}
					else { //если флажок выключен
						int_1=0; //переменная которая отвечаетза то что стеллаж доступен
						del_1.setEnabled(false);
						h_1.setEditable(false);
						a_1.setEditable(false);
						b_1.setEditable(false);
						kol_1.setEditable(false);
						kol_cell_1.setEditable(false);
						h_cell_1.setForeground(Color.GRAY); 
						a_cell_1.setForeground(Color.GRAY); 
						b_cell_1.setForeground(Color.GRAY); 
						kol_cell_st_1.setForeground(Color.GRAY); 
						stor_1.setForeground(Color.GRAY); 
						itog.setText("");
					}
			}                                                       
    	   }); 	
/*СТЕЛЛАЖ 2*/
		check_2.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==check_2)//если событие произошло именно с флажком check_, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то поля для ввода информации о стеллаже доступны  */
						int_2=1; //переменная которая отвечает за то что стеллаж доступен
						del_2.setEnabled(true);
						h_2.setEditable(true);
						a_2.setEditable(true);
						b_2.setEditable(true);
						kol_2.setEditable(true);
						kol_cell_2.setEditable(true);
						h_cell_2.setForeground(Color.BLACK); 
						a_cell_2.setForeground(Color.BLACK); 
						b_cell_2.setForeground(Color.BLACK); 
						kol_cell_st_2.setForeground(Color.BLACK); 
						stor_2.setForeground(Color.BLUE); 
						itog.setText("");
						}
					else { //если флажок выключен
						int_2=0; //переменная которая отвечаетза то что стеллаж доступен
						del_2.setEnabled(false);
						h_2.setEditable(false);
						a_2.setEditable(false);
						b_2.setEditable(false);
						kol_2.setEditable(false);
						kol_cell_2.setEditable(false);
						h_cell_2.setForeground(Color.GRAY); 
						a_cell_2.setForeground(Color.GRAY); 
						b_cell_2.setForeground(Color.GRAY); 
						kol_cell_st_2.setForeground(Color.GRAY); 
						stor_2.setForeground(Color.GRAY); 
						itog.setText("");
					}
			}                                                       
    	   });
/*СТЕЛЛАЖ 3*/
		check_3.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==check_3)//если событие произошло именно с флажком check_, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то поля для ввода информации о стеллаже доступны  */
						int_3=1; //переменная которая отвечает за то что стеллаж доступен
						del_3.setEnabled(true);
						h_3.setEditable(true);
						a_3.setEditable(true);
						b_3.setEditable(true);
						kol_3.setEditable(true);
						kol_cell_3.setEditable(true);
						h_cell_3.setForeground(Color.BLACK); 
						a_cell_3.setForeground(Color.BLACK); 
						b_cell_3.setForeground(Color.BLACK); 
						kol_cell_st_3.setForeground(Color.BLACK); 
						stor_3.setForeground(Color.BLUE); 
						itog.setText("");
						}
					else { //если флажок выключен
						int_3=0; //переменная которая отвечаетза то что стеллаж доступен
						del_3.setEnabled(false);
						h_3.setEditable(false);
						a_3.setEditable(false);
						b_3.setEditable(false);
						kol_3.setEditable(false);
						kol_cell_3.setEditable(false);
						h_cell_3.setForeground(Color.GRAY); 
						a_cell_3.setForeground(Color.GRAY); 
						b_cell_3.setForeground(Color.GRAY); 
						kol_cell_st_3.setForeground(Color.GRAY); 
						stor_3.setForeground(Color.GRAY); 
						itog.setText("");
					}
			}                                                       
    	   });		

/*СТЕЛЛАЖ 4*/
		check_4.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==check_4)//если событие произошло именно с флажком check_, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то поля для ввода информации о стеллаже доступны  */
						int_4=1; //переменная которая отвечает за то что стеллаж доступен
						del_4.setEnabled(true);
						h_4.setEditable(true);
						a_4.setEditable(true);
						b_4.setEditable(true);
						kol_4.setEditable(true);
						kol_cell_4.setEditable(true);
						h_cell_4.setForeground(Color.BLACK); 
						a_cell_4.setForeground(Color.BLACK); 
						b_cell_4.setForeground(Color.BLACK); 
						kol_cell_st_4.setForeground(Color.BLACK); 
						stor_4.setForeground(Color.BLUE); 
						itog.setText("");
						}
					else { //если флажок выключен
						int_4=0; //переменная которая отвечаетза то что стеллаж доступен
						del_4.setEnabled(false);
						h_4.setEditable(false);
						a_4.setEditable(false);
						b_4.setEditable(false);
						kol_4.setEditable(false);
						kol_cell_4.setEditable(false);
						h_cell_4.setForeground(Color.GRAY); 
						a_cell_4.setForeground(Color.GRAY); 
						b_cell_4.setForeground(Color.GRAY); 
						kol_cell_st_4.setForeground(Color.GRAY); 
						stor_4.setForeground(Color.GRAY); 
						itog.setText("");
					}
			}                                                       
    	   });			
/*СТЕЛЛАЖ 5*/
		check_5.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==check_5)//если событие произошло именно с флажком check_, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то поля для ввода информации о стеллаже доступны  */
						int_5=1; //переменная которая отвечает за то что стеллаж доступен
						del_5.setEnabled(true);
						h_5.setEditable(true);
						a_5.setEditable(true);
						b_5.setEditable(true);
						kol_5.setEditable(true);
						kol_cell_5.setEditable(true);
						h_cell_5.setForeground(Color.BLACK); 
						a_cell_5.setForeground(Color.BLACK); 
						b_cell_5.setForeground(Color.BLACK); 
						kol_cell_st_5.setForeground(Color.BLACK); 
						stor_5.setForeground(Color.BLUE); 
						itog.setText("");
						}
					else { //если флажок выключен
						int_5=0; //переменная которая отвечаетза то что стеллаж доступен
						del_5.setEnabled(false);
						h_5.setEditable(false);
						a_5.setEditable(false);
						b_5.setEditable(false);
						kol_5.setEditable(false);
						kol_cell_5.setEditable(false);
						h_cell_5.setForeground(Color.GRAY); 
						a_cell_5.setForeground(Color.GRAY); 
						b_cell_5.setForeground(Color.GRAY); 
						kol_cell_st_5.setForeground(Color.GRAY); 
						stor_5.setForeground(Color.GRAY); 
						itog.setText("");
					}
			}                                                       
    	   });			
		calc.addActionListener(new ActionListener()   
    			/* 	calc - кнопка Рассчитать 
    	 		"."  - указывает к какой переменной (кнопке) следует применить слушателя.
    	 		addActionListener - добавление слушателя ActionListener к кнопке
    	  		new - Оператор new создает экземпляр указанного класса 
    	  		(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
    	  		который будет отвечать за реагирование на события. 
    	  		В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
    	  		Поэтому будет использоваться интерфейс "ActionListener", 
    	  		предназначенный для обработки событий "ActionEvent".
    	  		тело интерфейса указывается ниже после фигурной скобки "{"
    	  		*/ 
    	   {                                                         
    	    public void actionPerformed(ActionEvent e)   
    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
      		который реализуется путем простого вызова обработчика событий ActionPerformed.
      		Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
      		Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
      	*/
    	    {  
    	    	//очищение полей в которые записаны результаты предыдущего расчета
    	    	size_1.setText("");
    	    	h_cell_1.setText("");
    	    	a_cell_1.setText("");
    	    	b_cell_1.setText("");
    	    	kol_cell_st_1.setText("");
    	    	stor_1.setText("");
    	    	
    	    	size_2.setText("");
    	    	h_cell_2.setText("");
    	    	a_cell_2.setText("");
    	    	b_cell_2.setText("");
    	    	kol_cell_st_2.setText("");
    	    	stor_2.setText("");
    	    	
    	    	size_3.setText("");
    	    	h_cell_3.setText("");
    	    	a_cell_3.setText("");
    	    	b_cell_3.setText("");
    	    	kol_cell_st_3.setText("");
    	    	stor_3.setText("");
    	    	
    	    	size_4.setText("");
    	    	h_cell_4.setText("");
    	    	a_cell_4.setText("");
    	    	b_cell_4.setText("");
    	    	kol_cell_st_4.setText("");
    	    	stor_4.setText("");
    	    	
    	    	size_5.setText("");
    	    	h_cell_5.setText("");
    	    	a_cell_5.setText("");
    	    	b_cell_5.setText("");
    	    	kol_cell_st_5.setText("");
    	    	stor_5.setText("");
    	    	
    	    	itog.setText("0");
    	    	int int_st_1=0,int_st_2=0,int_st_3=0,int_st_4=0,int_st_5=0;
    	    	if (int_1==1){ //если стеллаж выбран
    	    		if ((isValidInput(h_1, "высоту 1 стеллажа"))&&
    	    			(isValidInput(a_1, "ширину 1 стеллажа"))&&
    	    			(isValidInput(b_1, "глубину 1 стеллажа"))&&
    	    			(isValidInput(kol_1, "количество ярусов (1 стеллаж)"))&&
    	    			(isValidInput(kol_cell_1, "количество ячеек на ярусе (1 стеллаж)"))) {
    		    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
    			 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
    			   		Если введены некорректные данные, то выдает ошибку */	
    	    			int_st_1=1;
    	    		}
    	    	} else {
    	    		int_st_1=1;
    	    	}
    	    	if (int_2==1){ //если стеллаж выбран
    	    		if ((isValidInput(h_2, "высоту 2 стеллажа"))&&
    	    			(isValidInput(a_2, "ширину 2 стеллажа"))&&
    	    			(isValidInput(b_2, "глубину 2 стеллажа"))&&
    	    			(isValidInput(kol_2, "количество ярусов (2 стеллаж)"))&&
    	    			(isValidInput(kol_cell_2, "количество ячеек на ярусе (2 стеллаж)"))) {
    		    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
    			 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
    			   		Если введены некорректные данные, то выдает ошибку */	
    	    			int_st_2=1;
    	    		}
    	    	} else {
    	    		int_st_2=1;
    	    	}
    	    	if (int_3==1){ //если стеллаж выбран
    	    		if ((isValidInput(h_3, "высоту 3 стеллажа"))&&
    	    			(isValidInput(a_3, "ширину 3 стеллажа"))&&
    	    			(isValidInput(b_3, "глубину 3 стеллажа"))&&
    	    			(isValidInput(kol_3, "количество ярусов (3 стеллаж)"))&&
    	    			(isValidInput(kol_cell_3, "количество ячеек на ярусе (3 стеллаж)"))) {
    		    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
    			 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
    			   		Если введены некорректные данные, то выдает ошибку */	
    	    			int_st_3=1;
    	    		}
    	    	} else {
    	    		int_st_3=1;
    	    	}
    	    	if (int_4==1){ //если стеллаж выбран
    	    		if ((isValidInput(h_4, "высоту 4 стеллажа"))&&
    	    			(isValidInput(a_4, "ширину 4 стеллажа"))&&
    	    			(isValidInput(b_4, "глубину 4 стеллажа"))&&
    	    			(isValidInput(kol_4, "количество ярусов (4 стеллаж)"))&&
    	    			(isValidInput(kol_cell_4, "количество ячеек на ярусе (4 стеллаж)"))) {
    		    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
    			 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
    			   		Если введены некорректные данные, то выдает ошибку */	
    	    			int_st_4=1;
    	    		}
    	    	} else {
    	    		int_st_4=1;
    	    	}
    	    	if (int_5==1){ //если стеллаж выбран
    	    		if ((isValidInput(h_5, "высоту 5 стеллажа"))&&
    	    			(isValidInput(a_5, "ширину 5 стеллажа"))&&
    	    			(isValidInput(b_5, "глубину 5 стеллажа"))&&
    	    			(isValidInput(kol_5, "количество ярусов (5 стеллаж)"))&&
    	    			(isValidInput(kol_cell_5, "количество ячеек на ярусе (5 стеллаж)"))) {
    		    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
    			 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
    			   		Если введены некорректные данные, то выдает ошибку */	
    	    			int_st_5=1;
    	    		}
    	    	} else {
    	    		int_st_5=1;
    	    	}
    	    	
    	    	if (int_st_1*int_st_2*int_st_3*int_st_4*int_st_5==1){ //если все данные введены верно производим расчет
    	    		double d_stor_1,d_stor_2,d_stor_3,d_stor_4,d_stor_5;
/* 1 стеллаж*/
    	    		if (int_1==1){ //если стеллаж выбран
        	    		double d_h_1= Double.parseDouble(h_1.getText().replace(',','.'));
        	    		double d_a_1= Double.parseDouble(a_1.getText().replace(',','.'));
        	    		double d_b_1= Double.parseDouble(b_1.getText().replace(',','.'));
        	    		double d_kol_1= Double.parseDouble(kol_1.getText().replace(',','.'));
        	    		double d_kol_cell_1= Double.parseDouble(kol_cell_1.getText().replace(',','.'));
        	    		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
        	    		Преобразование данных в тип Double. */ 
        	    		d_stor_1=(d_h_1/100)*(d_a_1/100)*(d_b_1/100);
        	    		double d_h_cell_1=d_h_1/d_kol_1;
        	    		double d_a_cell_1=d_a_1/d_kol_cell_1;
        	    		double d_b_cell_1=d_b_1;
        	    		double d_kol_cell_st_1=d_kol_cell_1*d_kol_1;
        	    		String s_h_cell_1 = String.format("%.2f", d_h_cell_1);
        	    		String s_a_cell_1 = String.format("%.2f", d_a_cell_1);
        	    		String s_b_cell_1 = String.format("%.2f", d_b_cell_1);
        	    		String s_kol_cell_st_1 = String.format("%.2f", d_kol_cell_st_1);
        	    		String s_stor_1 = String.format("%.2f", d_stor_1);
    	    		    /* String - указываем что переменная будет иметь строковый тип,
    	    		     * s_stor_1 - название новой переменной,
    	    		     * String.format - преобразование переменной в строкой тип,
    	    		     	%.2f - указываем что переменная имеет тип Float, показываем 2 знака после запятой,
    	    		     	d_stor_1 - переменная типа double, которую надо преобразовать в строковый тип
    	    		     	 */
        	    		 /* Записываем строковую переменную в поля Jlabel */
        	    		h_cell_1.setText(s_h_cell_1);
        	    		a_cell_1.setText(s_a_cell_1);
        	    		b_cell_1.setText(s_b_cell_1);
        	    		kol_cell_st_1.setText(s_kol_cell_st_1);
        	    		stor_1.setText(s_stor_1);
    	    		} else {d_stor_1=0;}   
 /* 2 стеллаж*/   	    		
    	    		if (int_2==1){ //если стеллаж выбран
        	    		double d_h_2= Double.parseDouble(h_2.getText().replace(',','.'));
        	    		double d_a_2= Double.parseDouble(a_2.getText().replace(',','.'));
        	    		double d_b_2= Double.parseDouble(b_2.getText().replace(',','.'));
        	    		double d_kol_2= Double.parseDouble(kol_2.getText().replace(',','.'));
        	    		double d_kol_cell_2= Double.parseDouble(kol_cell_2.getText().replace(',','.'));
        	    		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
        	    		Преобразование данных в тип Double. */ 
        	    		d_stor_2=(d_h_2/100)*(d_a_2/100)*(d_b_2/100);
        	    		double d_h_cell_2=d_h_2/d_kol_2;
        	    		double d_a_cell_2=d_a_2/d_kol_cell_2;
        	    		double d_b_cell_2=d_b_2;
        	    		double d_kol_cell_st_2=d_kol_cell_2*d_kol_2;
        	    		String s_h_cell_2 = String.format("%.2f", d_h_cell_2);
        	    		String s_a_cell_2 = String.format("%.2f", d_a_cell_2);
        	    		String s_b_cell_2 = String.format("%.2f", d_b_cell_2);
        	    		String s_kol_cell_st_2 = String.format("%.2f", d_kol_cell_st_2);
        	    		String s_stor_2 = String.format("%.2f", d_stor_2);
    	    		    /* String - указываем что переменная будет иметь строковый тип,
    	    		     * s_stor_2 - название новой переменной,
    	    		     * String.format - преобразование переменной в строкой тип,
    	    		     	%.2f - указываем что переменная имеет тип Float, показываем 2 знака после запятой,
    	    		     	d_stor_2 - переменная типа double, которую надо преобразовать в строковый тип
    	    		     	 */
        	    		 /* Записываем строковую переменную в поля Jlabel */
        	    		h_cell_2.setText(s_h_cell_2);
        	    		a_cell_2.setText(s_a_cell_2);
        	    		b_cell_2.setText(s_b_cell_2);
        	    		kol_cell_st_2.setText(s_kol_cell_st_2);
        	    		stor_2.setText(s_stor_2);
    	    		} else {d_stor_2=0;}  

 /* 3 стеллаж*/   	    		
    	    		if (int_3==1){ //если стеллаж выбран
        	    		double d_h_3= Double.parseDouble(h_3.getText().replace(',','.'));
        	    		double d_a_3= Double.parseDouble(a_3.getText().replace(',','.'));
        	    		double d_b_3= Double.parseDouble(b_3.getText().replace(',','.'));
        	    		double d_kol_3= Double.parseDouble(kol_3.getText().replace(',','.'));
        	    		double d_kol_cell_3= Double.parseDouble(kol_cell_3.getText().replace(',','.'));
        	    		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
        	    		Преобразование данных в тип Double. */ 
        	    		d_stor_3=(d_h_3/100)*(d_a_3/100)*(d_b_3/100);
        	    		double d_h_cell_3=d_h_3/d_kol_3;
        	    		double d_a_cell_3=d_a_3/d_kol_cell_3;
        	    		double d_b_cell_3=d_b_3;
        	    		double d_kol_cell_st_3=d_kol_cell_3*d_kol_3;
        	    		String s_h_cell_3 = String.format("%.2f", d_h_cell_3);
        	    		String s_a_cell_3 = String.format("%.2f", d_a_cell_3);
        	    		String s_b_cell_3 = String.format("%.2f", d_b_cell_3);
        	    		String s_kol_cell_st_3 = String.format("%.2f", d_kol_cell_st_3);
        	    		String s_stor_3 = String.format("%.2f", d_stor_3);
    	    		    /* String - указываем что переменная будет иметь строковый тип,
    	    		     * s_stor_3 - название новой переменной,
    	    		     * String.format - преобразование переменной в строкой тип,
    	    		     	%.2f - указываем что переменная имеет тип Float, показываем 2 знака после запятой,
    	    		     	d_stor_3 - переменная типа double, которую надо преобразовать в строковый тип
    	    		     	 */
        	    		/* Записываем строковую переменную в поля Jlabel */
        	    		h_cell_3.setText(s_h_cell_3);
        	    		a_cell_3.setText(s_a_cell_3);
        	    		b_cell_3.setText(s_b_cell_3);
        	    		kol_cell_st_3.setText(s_kol_cell_st_3);
        	    		stor_3.setText(s_stor_3);
    	    		} else {d_stor_3=0;}     	    		
 /* 4 стеллаж*/   	    		
    	    		if (int_4==1){ //если стеллаж выбран
        	    		double d_h_4= Double.parseDouble(h_4.getText().replace(',','.'));
        	    		double d_a_4= Double.parseDouble(a_4.getText().replace(',','.'));
        	    		double d_b_4= Double.parseDouble(b_4.getText().replace(',','.'));
        	    		double d_kol_4= Double.parseDouble(kol_4.getText().replace(',','.'));
        	    		double d_kol_cell_4= Double.parseDouble(kol_cell_4.getText().replace(',','.'));
        	    		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
        	    		Преобразование данных в тип Double. */ 
        	    		d_stor_4=(d_h_4/100)*(d_a_4/100)*(d_b_4/100);
        	    		double d_h_cell_4=d_h_4/d_kol_4;
        	    		double d_a_cell_4=d_a_4/d_kol_cell_4;
        	    		double d_b_cell_4=d_b_4;
        	    		double d_kol_cell_st_4=d_kol_cell_4*d_kol_4;
        	    		String s_h_cell_4 = String.format("%.2f", d_h_cell_4);
        	    		String s_a_cell_4 = String.format("%.2f", d_a_cell_4);
        	    		String s_b_cell_4 = String.format("%.2f", d_b_cell_4);
        	    		String s_kol_cell_st_4 = String.format("%.2f", d_kol_cell_st_4);
        	    		String s_stor_4 = String.format("%.2f", d_stor_4);
    	    		    /* String - указываем что переменная будет иметь строковый тип,
    	    		     * s_stor_4 - название новой переменной,
    	    		     * String.format - преобразование переменной в строкой тип,
    	    		     	%.2f - указываем что переменная имеет тип Float, показываем 2 знака после запятой,
    	    		     	d_stor_4 - переменная типа double, которую надо преобразовать в строковый тип
    	    		     	 */
        	    		h_cell_4.setText(s_h_cell_4);
        	    		a_cell_4.setText(s_a_cell_4);
        	    		b_cell_4.setText(s_b_cell_4);
        	    		kol_cell_st_4.setText(s_kol_cell_st_4);
        	    		stor_4.setText(s_stor_4);
    	    		} else {d_stor_4=0;}  
 /* 5 стеллаж*/   	    		
    	    		if (int_5==1){ //если стеллаж выбран
        	    		double d_h_5= Double.parseDouble(h_5.getText().replace(',','.'));
        	    		double d_a_5= Double.parseDouble(a_5.getText().replace(',','.'));
        	    		double d_b_5= Double.parseDouble(b_5.getText().replace(',','.'));
        	    		double d_kol_5= Double.parseDouble(kol_5.getText().replace(',','.'));
        	    		double d_kol_cell_5= Double.parseDouble(kol_cell_5.getText().replace(',','.'));
        	    		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
        	    		Преобразование данных в тип Double. */ 
        	    		d_stor_5=(d_h_5/100)*(d_a_5/100)*(d_b_5/100);
        	    		double d_h_cell_5=d_h_5/d_kol_5;
        	    		double d_a_cell_5=d_a_5/d_kol_cell_5;
        	    		double d_b_cell_5=d_b_5;
        	    		double d_kol_cell_st_5=d_kol_cell_5*d_kol_5;
        	    		String s_h_cell_5 = String.format("%.2f", d_h_cell_5);
        	    		String s_a_cell_5 = String.format("%.2f", d_a_cell_5);
        	    		String s_b_cell_5 = String.format("%.2f", d_b_cell_5);
        	    		String s_kol_cell_st_5 = String.format("%.2f", d_kol_cell_st_5);
        	    		String s_stor_5 = String.format("%.2f", d_stor_5);
    	    		    /* String - указываем что переменная будет иметь строковый тип,
    	    		     * s_stor_5 - название новой переменной,
    	    		     * String.format - преобразование переменной в строкой тип,
    	    		     	%.2f - указываем что переменная имеет тип Float, показываем 2 знака после запятой,
    	    		     	d_stor_5 - переменная типа double, которую надо преобразовать в строковый тип
    	    		     	 */
        	    		 /* Записываем строковую переменную в поля Jlabel */
        	    		h_cell_5.setText(s_h_cell_5);
        	    		a_cell_5.setText(s_a_cell_5);
        	    		b_cell_5.setText(s_b_cell_5);
        	    		kol_cell_st_5.setText(s_kol_cell_st_5);
        	    		stor_5.setText(s_stor_5);
    	    		} else {d_stor_5=0;}  
        	    	double d_itog=d_stor_1+d_stor_2+d_stor_3+d_stor_4+d_stor_5;
    	    		String s_itog = String.format("%.2f", d_itog);
    	    		itog.setText(s_itog); /* Записываем строковую переменную в поля Jlabel */

    	    	}
    	    	
    	    	
    	    	}   	    	                             
    	   }); 
//Слушатель для кнопки ОЧИСТИТЬ стеллаж 1			
		del_1.addActionListener(new ActionListener(){    //добавляем слушателя события для кнопки 
			/*      "."  - указывает к какой переменной (кнопке) следует применить слушателя.
		 	addActionListener - добавление слушателя ActionListener к кнопке
		  	new - Оператор new создает экземпляр указанного класса 
		  	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
		  	который будет отвечать за реагирование на события. 
		  	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
		  	Поэтому будет использоваться интерфейс "ActionListener", 
		  	предназначенный для обработки событий "ActionEvent".
		  	тело интерфейса указывается ниже после фигурной скобки "{"
    	    */
    	    public void actionPerformed(ActionEvent e) 
    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
	      	который реализуется путем простого вызова обработчика событий ActionPerformed.
	      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
	      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
	      	*/             
    	    {   
		    	//	Обнуляем все поля, переменные, флажки ставим в состояние выключен
    	    	h_1.setText("");
    	    	a_1.setText("");
    	    	b_1.setText("");
    	    	kol_1.setText("");
    	    	kol_cell_1.setText("");
    	    	h_cell_1.setText("");
    	    	a_cell_1.setText("");
    	    	b_cell_1.setText("");
    	    	kol_cell_st_1.setText("");
    	    	stor_1.setText("");
    	    	itog.setText("");

    	    }    	    	                                                        
    	   });		
	del_2.addActionListener(new ActionListener(){ 
    	    public void actionPerformed(ActionEvent e)       
    	    {   
		    	//	Обнуляем все поля, переменные, флажки ставим в состояние выключен
    	    	h_2.setText("");
    	    	a_2.setText("");
    	    	b_2.setText("");
    	    	kol_2.setText("");
    	    	kol_cell_2.setText("");
    	    	h_cell_2.setText("");
    	    	a_cell_2.setText("");
    	    	b_cell_2.setText("");
    	    	kol_cell_st_2.setText("");
    	    	stor_2.setText("");
    	    	itog.setText("");

    	    }    	    	                                                        
    	   });		
	del_3.addActionListener(new ActionListener(){ 
	    public void actionPerformed(ActionEvent e)       
	    {   
	    	//	Обнуляем все поля, переменные, флажки ставим в состояние выключен
	    	h_3.setText("");
	    	a_3.setText("");
	    	b_3.setText("");
	    	kol_3.setText("");
	    	kol_cell_3.setText("");
	    	h_cell_3.setText("");
	    	a_cell_3.setText("");
	    	b_cell_3.setText("");
	    	kol_cell_st_3.setText("");
	    	stor_3.setText("");
	    	itog.setText("");

	    }    	    	                                                        
	   });	
	   
	   	del_4.addActionListener(new ActionListener(){ 
	    public void actionPerformed(ActionEvent e)       
	    {   
	    	//	Обнуляем все поля, переменные, флажки ставим в состояние выключен
	    	h_4.setText("");
	    	a_4.setText("");
	    	b_4.setText("");
	    	kol_4.setText("");
	    	kol_cell_4.setText("");
	    	h_cell_4.setText("");
	    	a_cell_4.setText("");
	    	b_cell_4.setText("");
	    	kol_cell_st_4.setText("");
	    	stor_4.setText("");
	    	itog.setText("");

	    }    	    	                                                        
	   });	
	   
	   	del_5.addActionListener(new ActionListener(){ 
	    public void actionPerformed(ActionEvent e)       
	    {   
	    	//	Обнуляем все поля, переменные, флажки ставим в состояние выключен
	    	h_5.setText("");
	    	a_5.setText("");
	    	b_5.setText("");
	    	kol_5.setText("");
	    	kol_cell_5.setText("");
	    	h_cell_5.setText("");
	    	a_cell_5.setText("");
	    	b_cell_5.setText("");
	    	kol_cell_st_5.setText("");
	    	stor_5.setText("");
	    	itog.setText("");

	    }    	    	                                                        
	   });			
	}	

	//проверка данных, введенных пользователем
    public static boolean isValidInput(JTextField jtxt, String description) {

        JDialog D = new JDialog();
		//если был введен какой-либо текст
        if (jtxt.getText().trim().length() > 0) {
            //проверка на ввод только целого числа
            try { /* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/
              
                 double num = Double.parseDouble(jtxt.getText().replace(',','.')); //попытка преобразовать текст в целое число      
                 if (num>0){ //если переменная меньше или равна нулю - ошибка
                	 return true; //если все нормально - возвращаем true
                 }
                 else {
                     jtxt.requestFocus();
                     jtxt.setText("");//очистить текстовое поле
                     //предупреждение - неверный формат числа
                     JOptionPane.showMessageDialog(D, "Значение не может быть меньше или равно нулю!", "Ошибка", JOptionPane.WARNING_MESSAGE);
                	 return false;
                 }
            } catch (NumberFormatException e) {
            	/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/

                //расположить курсор в текстовое поле, чтобы пользователь еще раз ввел число
                jtxt.requestFocus();
                jtxt.setText("");//очистить текстовое поле
   			
                //предупреждение - неверный формат числа
                JOptionPane.showMessageDialog(D, "Вы должны ввести число!", "Ошибка", JOptionPane.WARNING_MESSAGE);

                return false;//ошибка - возвращаем false
            }

        } else {// если пользователь не ввели никаких данных

            //предупреждение, что нужно ввести данные
            JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE);

            //расположить курсор в текстово окне, чтобы пользователь еще раз ввел число
            jtxt.requestFocus();
            jtxt.selectAll();//очистить текстовое поле

            //ошибка - возвращаем false
            return false;
        }
    }	

}

