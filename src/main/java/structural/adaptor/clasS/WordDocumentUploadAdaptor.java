package structural.adaptor.clasS;

public class WordDocumentUploadAdaptor extends WordDocumentUploader implements DocumentUploader {

    @Override
    public void upload() {
        wordDocumentUpload();
    }

    @Override
    public void wordDocumentUpload() {
        System.out.println("Uploading WORD document...");
    }
}
