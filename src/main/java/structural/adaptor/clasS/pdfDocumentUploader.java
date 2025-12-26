package structural.adaptor.clasS;

public class pdfDocumentUploader implements DocumentUploader {

    @Override
    public void upload() {
        System.out.println("Uploading PDF Document...");
    }
}
