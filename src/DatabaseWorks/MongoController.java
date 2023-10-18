package DatabaseWorks;

import Users.Realtor;
import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.Collection;

public class MongoController {
    public MongoDatabase database;
    public MongoController(String uri){

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
    }

    public void saveRealtor(){
        try {
            MongoCollection<Document> x = database.getCollection("realtors");
        }catch (MongoException me){
            database.createCollection("relations");
        }

    }

    public Realtor getRealtors(){
        Realtor a = new Realtor("abb", "123", "abb", "1");
        return a;
    }
}
