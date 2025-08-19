package _15_facade.pagemaker;

import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;

class HtmlWriter implements Closeable {

    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html>").append("<head>")
                .append("<title>").append(title)
                .append("</title>").append("</head>")
                .append("<body>").append("\n")
                .append("<h1>").append(title).append("</h1>");
        writer.write(buffer.toString());
    }

    public void paragraph(String message) throws IOException {
        writer.write("<p>" + message + "</p>\n");
    }

    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailAddress, String username) throws IOException {
        link(mailAddress, username);
    }

    @Override
    public void close() throws IOException {
        writer.write("</body></html>\n");
        writer.close();
        writer = null;
    }
}
