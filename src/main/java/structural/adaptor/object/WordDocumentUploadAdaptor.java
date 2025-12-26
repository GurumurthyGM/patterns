package structural.adaptor.object;

public class WordDocumentUploadAdaptor implements DocumentUploader{

    private final WordDocumentUploader wordDocumentUploader ;

    public WordDocumentUploadAdaptor() {
        wordDocumentUploader = new  WordDocumentUploader();
    }

    @Override
    public void upload() {
        wordDocumentUploader.WordDocumentUpload();
    }
}
