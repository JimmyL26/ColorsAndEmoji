public class Fish {
    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";
    public  final String YELLOW = "\033[0;33m";  // YELLOW

    private final String eye = "\u00B0";
    private final String wave = "\uD83C\uDF0A";

    public void animate() throws InterruptedException
    {
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 25; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 18; i++)
        {
            System.out.print(CYAN + wave);
        }
        System.out.print(YELLOW + "<" + eye + ")))><");
        for (int i = 0; i < 3; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(YELLOW + "                            <" + eye + ")))><");
        for (int i = 0; i < 25; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);

        System.out.println("");
        System.out.println("");
        System.out.println(YELLOW + "                          <" + eye + ")))><");
        System.out.println(WHITE + "                              \\  \\");
        for (int i = 0; i < 25; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);

        System.out.println("");
        System.out.println("");
        System.out.println(YELLOW + "                        <" + eye + ")))><");
        System.out.println(WHITE + "                             \\  \\");
        System.out.println("                              \\  \\");
        for (int i = 0; i < 25; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);

        System.out.println("");
        System.out.println("");
        System.out.println(YELLOW + "                      <" + eye + ")))><");
        System.out.println(WHITE + "                           \\  \\");
        System.out.println("                             \\  \\");
        System.out.println("");
        for (int i = 0; i < 25; i++)
        {
            System.out.print(CYAN + wave);
        }

        System.out.println("");
        System.out.println("");
        System.out.println(YELLOW + "                    <" + eye + ")))><");
        System.out.println(WHITE + "                          \\  \\");
        System.out.println("                            \\  \\");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 25; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);

        System.out.println("");
        System.out.println("");
        System.out.println(YELLOW + "                    <" + eye + ")))><");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 25; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);

        System.out.println("");
        System.out.println("");
        System.out.println(YELLOW + "                  <" + eye + ")))><");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 25; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);

        System.out.println("");
        System.out.println(WHITE + "                  /  /");
        System.out.println(YELLOW + "                <" + eye + ")))><");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 25; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);

        System.out.println("");
        System.out.println(WHITE + "                   /  /");
        System.out.println("                  /  /");
        System.out.println(YELLOW + "              <" + eye + ")))><");
        System.out.println("");
        for (int i = 0; i < 25; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);

        System.out.println("");
        System.out.println(WHITE + "                 /  /");
        System.out.println("                /  /");
        System.out.println(YELLOW + "            <" + eye + ")))><");
        for (int i = 0; i < 25; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(CYAN + wave);
        }
        System.out.print(YELLOW + "<" + eye + ")))><");
        for (int i = 0; i < 16; i++)
        {
            System.out.print(CYAN + wave);
        }
        Thread.sleep(500);
    }
}