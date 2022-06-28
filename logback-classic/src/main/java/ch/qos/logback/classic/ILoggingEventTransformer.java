package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.ILoggingEvent;

public interface ILoggingEventTransformer {
    ILoggingEventTransformer IDENTITY = new ILoggingEventTransformer() {
        @Override
        public ILoggingEvent transform(ILoggingEvent event) {
            return event;
        }
    };

    ILoggingEvent transform(ILoggingEvent event);
}