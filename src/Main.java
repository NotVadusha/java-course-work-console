import DatabaseWorks.MongoController;
import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        String uri = "mongodb+srv://vadimkbondarchuk:wedULtVrzHlfW6sU@classes.1k3gh73.mongodb.net/?retryWrites=true&w=majority";
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(uri))
                .build();
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            MongoDatabase database = mongoClient.getDatabase("admin");
            try {
                // Send a ping to confirm a successful connection
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
            } catch (MongoException me) {
                System.err.println(me);
            }
        }

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Hello! What do you want to get?");
            System.out.println("1. Realtors list");
            System.out.println("2. RealEstates list");
            System.out.println("3. Clients list ");
            System.out.println("4. Area with greatest demand");
            System.out.println("5. RealEstate with biggest rooms count");
            System.out.println("6. Average RealEstate ");

            String result = scanner.nextLine();
            if (result.equals("q")) {break;}
            switch (result) {
                case ("1"):
//                    database.saveRealtor();
                    break;
                case ("2"):
                    break;
                case ("3"):
                    break;
                case ("4"):
                    break;
                case ("5"):
                    break;
                case ("6"):
                    break;
            }
        }

    }
}