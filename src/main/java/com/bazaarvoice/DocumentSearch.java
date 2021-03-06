package com.bazaarvoice;


import java.util.List;

public interface DocumentSearch {

    void setSchema(Schema schema);

    void storeDocument(Document document);

    /*eg search("description", "day") should return below document

    * {
    *     "description" : "another day in my life!",
    *     "text" : "sample text",
    *     "word" : "purple",
    *     "name" : "test document",
    *     "id" : 101
    *  }
    */

    List<Document> search(String field, Object value);

}
