class InitParent{
    InitParent(int x){System.out.println("InitParent:1-arg const");}
    InitParent(){System.out.println("InitParent:no-arg const");}
    static {System.out.println("InitParent:1st static init");}
    {System.out.println("InitParent:1st instance init");}
    {System.out.println("InitParent:2nd instance init");}
    static{System.out.println("InitParent:2nd static init");}
    public static void main(String [] args) {
    new InitParent();
    new InitParent(7);
    }
    }