package structural.adaptor.clasS;

public class OnlineApplicationUploader {

    private final DocumentUploader docUploader;
    public OnlineApplicationUploader(DocumentUploader documentUploader) {
            this.docUploader = documentUploader;
    }

    public void uploadDocument() {
        docUploader.upload();
    }

}
