class EducationalBook extends Book {
    private String subject;
    private String level;
    public EducationalBook(String title, String author, int year, String isbn, boolean isAvailable, String subject, String level) {
        super(title, author, year, isbn, isAvailable);
        this.subject = subject;
        this.level = level;
    }
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Subject: " + subject + ", Level: " + level);
    }

    public Object getSubject() {
        return subject;
    }

    public void setSubject(Object subject) {
        this.subject = (String) subject;
    }
}
