class FictionBook extends Book {
    private String genre;


    public FictionBook(String title, String author, int year, String isbn, boolean isAvailable, String genre) {
        super(title, author, year, isbn, isAvailable);
        this.genre = genre;
    }


    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Genre: " + genre);
    }

    public Object getGenre() {
        return null;
    }
}

