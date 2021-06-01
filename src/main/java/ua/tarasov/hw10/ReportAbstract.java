package ua.tarasov.hw10;

public abstract class ReportAbstract {
    private String header;
    private String footer;

    public ReportAbstract(String header, String footer) {
        setHeader(header);
        setFooter(footer);
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}
