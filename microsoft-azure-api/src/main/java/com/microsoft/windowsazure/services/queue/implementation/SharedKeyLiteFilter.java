package com.microsoft.windowsazure.services.queue.implementation;

import javax.inject.Named;

import com.microsoft.windowsazure.services.queue.QueueConfiguration;

public class SharedKeyLiteFilter extends com.microsoft.windowsazure.services.blob.implementation.SharedKeyLiteFilter {
    public SharedKeyLiteFilter(@Named(QueueConfiguration.ACCOUNT_NAME) String accountName,
            @Named(QueueConfiguration.ACCOUNT_KEY) String accountKey) {
        super(accountName, accountKey);
    }
}
