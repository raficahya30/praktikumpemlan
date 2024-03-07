package perpusprak;

public class databook {
    public String[][] forAgama() {
    return agama;
    }
    private String[][] agama = {
    {"The Book of Mormon", "Joseph Smith Jr.", "500 halaman", "1830", "The Church of Jesus Christ of Latter-day Saints"},
    {"The Talmud", "Various Authors", "600 halaman", "1960", "Mesorah Publications, ArtScroll"},
    {"The Vedas", "Various Authors", "700 halaman ", "1340", "Penguin Classics, Oxford University Press"},
    {"The Kitab-i-Aqdas", "Bahá'u'lláh", "400 halaman", "878 SM", "Bahá'í Publishing Trust"},
    {"The Guru Granth Sahib", "Guru-Guru Sikh", "800 halaman", "2010", "Punjabi University, Hemkunt Press"},
    {"The Tripitaka", "Various Authors", "900 halaman", "1880", "Pali Text Society, Oxford University Press"} };
    
    
    public String[][] forSejarah() {
    return sejarah;
    }
    private String[][] sejarah = { 
    {"Sejarah Dunia Modern: 1500-2000", "Richard J. Evans", "896 halaman", "2013", "Gramedia Pustaka Utama"},
    {"Sejarah Kebudayaan Islam", "Syafiq al-Hasyimi", "456 halaman", "2008", "Gema Insani Press"},
    {"Sejarah Peradaban Manusia: Dari Zaman Batu Hingga Zaman Modern", "Martin L. Van Creveld", "400 halaman", "2016", "Kepustakaan Populer Gramedia"},
    {"Sejarah Modern Indonesia: 1200-2008", "M.C. Ricklefs", "440 halaman", "2008", "Serambi"},
    {"Sejarah Peradaban Islam", "Abdul Qadir Syaibah", "352 halaman", "2010", "Gema Insani Press"},
    {"Sejarah Pemikiran Ekonomi", "N. Gregory Mankiw", "560 halaman", "2011", "Salemba Empat"} };


    public String[][] forFilsafat() {
    return filsafat;
    }
    private String[][] filsafat = { 
    { "Meditasi", "Marcus Aurelius", "208 halaman", "1860", "Modern Library" },
    { "Republik", "Plato", "384 halaman", "380 SM", "Hackett Publishing Company" },
    { "Kritik atas Nalar Murni", "Immanuel Kant", "664 halaman", "1781", "Cambridge University Press" },
    { "Leviathan", "Thomas Hobbes", "448 halaman", "1651", "Oxford University Press" },
    { "Dua Risalah tentang Pemerintahan", "John Locke", "256 halaman", "1689", "Hackett Publishing Company" },
    { "rocky berfikir", "tri sutami", "256 halaman", "600 SM", "montana picture"} };


    public String[][] forTeknologi() {
    return teknologi;
    }
    private String[][] teknologi = {
    { "head first java", "Francois Chollet", "528 halaman", "2021", "Manning Publications" },
    { "The amazing Programmer: From Journeyman to Master", "Andrew Hunt", "392 halaman", "2000", "Addison-Wesley Professional" },
    { "spectacular Algorithms", "Thomas J, Clifford Stein", "1392 halaman", "2022", "MIT Press" },
    { "Artificial Intelligence: A Modern Approach", "Stuart Russell, Peter Norvig", "1118 halaman", "2021", "Pearson Education Limited" },
    { "perfect Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "431 halaman", "2008", "Pearson Education" },
    { "life as perfect code", "Robert C. Martin", "431 halaman", "2008", "Pearson Education" } };


    public String[][] forFiksi() {
    return fiksi;
    }
    private String[][] fiksi = { 
    { "A Game of Thrones", "George R.R", "807 halaman", "1996", "Bantam Books" },
    { "Seri Harry Potter", "oleh J.K. Rowling","3899 halaman", "1997-2007", "Scholastic Press" },
    { "To Kill a Mockingbird", "oleh Harper Lee","324 halaman", "1960", "HarperCollins" },
    { "The Hitchhiker's Guide to the Galaxy", "oleh Douglas Adams", "224 halaman", "1979", "Pan Books" },
    { "The Catcher in the Rye", "oleh J.D. Salinger","275 halaman", "1951", "Little Brown and Company" },
    { "the chronicles of narnia", "oleh J.J Thompson", "350 halaman", "2012", "montana books"} };


    public String[][] forPsikologi() {
    return psikologi;
    }
    private String[][] psikologi = { 
    {"Man's Search for Meaning", "Viktor E. Frankl", "168 halaman", "1946", "Beacon Press"},
    {"Thinking, Fast and Slow", "Daniel Kahneman", "512 halaman", "2011", "Farrar, Straus and Giroux"},
    {"The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", "400 halaman", "2012", "Random House"},
    {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "352 halaman", "2012", "Crown Publishers"},
    {"Emotional Intelligence: Why It Can Matter More Than IQ", "Daniel Goleman", "384 halaman", "1995", "Bantam Books"},
    {"The Psychology Book", "DK", "352 halaman", "2012", "DK Publishing"} };


    public String[][] forPolitik() {
        return politik;
    }
    public String[][] politik = { 
    {"The Prince", "Niccolò Machiavelli", "140 halaman", "1532", "Various Publishers"},
    {"Democracy in America", "Alexis de Tocqueville", "150 halaman (Tergantung pada edisi)", "1835-1840", "Various Publishers"},
    {"The Communist Manifesto", "Karl Marx dan Friedrich Engels", "235 halaman", "1848", "Various Publishers"},
    {"The Republic", "Plato", "405 halaman", "Sekitar 380 SM", "Various Publishers"},
    {"The Federalist Papers", "James Madison, dan John Jay", "345 halaman", "1787-1788", "Various Publishers"},
    {"Das Kapital", "Karl Marx", "320 halaman", "1867", "Various Publishers"} };

    public static void tampilan(String[][] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Judul buku: " + list[i][0]);
            System.out.println("Nama Penulis: " + list[i][1]);
            System.out.println("Jumlah Halaman: " + list[i][2]);
            System.out.println("Tahun Terbit: " + list[i][3]);
            System.out.println("Penerbit: " + list[i][4]);
            System.out.println();
        }
    }
}
