package ao.morgado.bootstrapper.request;

import java.util.Objects;

public abstract class AbstractTransactionHandler<T_REQUEST, T_RESPONSE> {

    protected String createXmlTag(String tagName, Object value) {
        String content = Objects.toString(value, "");
        return  String.format("<%s>%s</%s>", tagName, content, tagName);
    }
}