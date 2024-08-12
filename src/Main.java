import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class Main {

    public static ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        blockchain.add(new Block("Testando o primeiro block com arraylist", "1"));
        blockchain.add(new Block("Testando o segundo block com arraylist", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("Testando o terceiro block com arraylist", blockchain.get(blockchain.size()-1).hash));

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println(blockchainJson);
    }
}