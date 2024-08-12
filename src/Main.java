public class Main {
    public static void main(String[] args) {

        Block firstBlock = new Block("Primeira mensagem", "0");
        System.out.println("Hash para o block 1 :" + firstBlock.hash);

        Block secondBlock = new Block("Segunda mensagem", firstBlock.hash);
        System.out.println("Hash para o block 2 :" + secondBlock.hash);

        Block thirdBlock = new Block("Terceira mensagem", secondBlock.hash);
        System.out.println("Hash para o block 3 :" + thirdBlock.hash);
    }
}