package app;

/**
 * XMLFormat
 */
public class XMLFormat implements IDataFormat {

    Data d;
    public XMLFormat(Data d) {
        this.d = d;
    }
    @Override
    public FormattedData data() {
        return new FormattedData("<" + d.dataKey + ">" +
            d.dataValue + "</" + d.dataKey + ">");
    }
}