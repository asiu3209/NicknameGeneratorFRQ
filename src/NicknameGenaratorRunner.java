public class NicknameGenaratorRunner {
    public static void main(String[] args)
    {

        NicknameGenerator name1 = new NicknameGenerator("CELESE","NG");
        System.out.println(name1.nicknames());
        NicknameGenerator name2 = new NicknameGenerator("GLEN","SMITH");
        System.out.println(name2.nicknames());
        NicknameGenerator name3 = new NicknameGenerator("JUANITA","LOPES");
        System.out.println(name3.nicknames());
        NicknameGenerator name4 = new NicknameGenerator("MARY","ASHE");
        System.out.println(name4.nicknames());
    }
}
