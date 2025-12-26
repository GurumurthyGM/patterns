package structural.adaptor.object;

public class App {

    public static void main(String[] args) {
        DocumentUploader pdfDocUploader = new pdfDocumentUploader();
        OnlineApplicationUploader uploader = new OnlineApplicationUploader(pdfDocUploader);
        uploader.uploadDocument();

        DocumentUploader wordDocUploader = new WordDocumentUploadAdaptor();
        OnlineApplicationUploader uploader2 = new OnlineApplicationUploader(wordDocUploader);
        uploader2.uploadDocument();




    }
}
