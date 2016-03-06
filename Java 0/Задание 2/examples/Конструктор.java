class Box {
    int width;
    int height;
    int depth;

    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(int len) {
		this(len,len,len);
    }
	
	// Конструктор для создания клона объекта
	Box(Box ob, int width) { // передача объекта конструктору
		width = width;
		height = ob.height;
		depth = ob.depth;
	}
	
}

Box catbox = new Box();


