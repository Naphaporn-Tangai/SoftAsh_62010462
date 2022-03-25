package creational;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject JsBookObject;
    private JSONArray JsBookList;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        JsBookObject = new JSONObject();
        JsBookList = new JSONArray();
        JsBookObject.put(Book.class.getSimpleName() + "s", JsBookList);
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        String[] author = b.getAuthors();
        try {
            JSONObject JSElements = new JSONObject();
            JSONArray authList = new JSONArray();
            for(int i=0; i<author.length; i++)
            {
                authList.add(author[i]);
            }
        JSElements.put(Book.Metadata.ISBN.value, b.getISBN());
        JSElements.put(Book.Metadata.AUTHORS.value, authList);
        JSElements.put(Book.Metadata.TITLE.value, b.getTitle());
        JSElements.put(Book.Metadata.PUBLISHER.value, b.getPublisher());
        
        JsBookList.add(JSElements); 
    }catch (Exception e) {
        e.printStackTrace();
    } 
    return this;
    }

    @Override
    public String getMetadataString() {
        return JsBookObject.toJSONString();
    }
}
