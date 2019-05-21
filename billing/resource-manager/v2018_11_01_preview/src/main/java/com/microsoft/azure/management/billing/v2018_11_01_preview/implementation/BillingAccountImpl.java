/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccount;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Address;
import java.util.List;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Enrollment;
import java.util.ArrayList;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfile;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Department;
import com.microsoft.azure.management.billing.v2018_11_01_preview.EnrollmentAccount;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSection;

class BillingAccountImpl extends CreatableUpdatableImpl<BillingAccount, BillingAccountInner, BillingAccountImpl> implements BillingAccount, BillingAccount.Update {
    private String billingAccountName;
    private final BillingManager manager;

    BillingAccountImpl(String name, BillingManager manager) {
        super(name, new BillingAccountInner());
        this.manager = manager;
        // Set resource name
        this.billingAccountName = name;
        //
    }

    BillingAccountImpl(BillingAccountInner inner, BillingManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.billingAccountName = inner.name();
        // set resource ancestor and positional variables
        this.billingAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingAccounts");
        // set other parameters for create and update
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BillingAccount> createResourceAsync() {
        BillingAccountsInner client = this.manager().inner().billingAccounts();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<BillingAccount> updateResourceAsync() {
        BillingAccountsInner client = this.manager().inner().billingAccounts();
        return client.updateAsync(this.billingAccountName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BillingAccountInner> getInnerAsync() {
        BillingAccountsInner client = this.manager().inner().billingAccounts();
        return client.getAsync(this.billingAccountName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String accountType() {
        return this.inner().accountType();
    }

    @Override
    public Address address() {
        return this.inner().address();
    }

    @Override
    public List<BillingProfile> billingProfiles() {
        List<BillingProfile> lst = new ArrayList<BillingProfile>();
        if (this.inner().billingProfiles() != null) {
            for (BillingProfileInner inner : this.inner().billingProfiles()) {
                lst.add( new BillingProfileImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String company() {
        return this.inner().company();
    }

    @Override
    public String country() {
        return this.inner().country();
    }

    @Override
    public List<Department> departments() {
        List<Department> lst = new ArrayList<Department>();
        if (this.inner().departments() != null) {
            for (DepartmentInner inner : this.inner().departments()) {
                lst.add( new DepartmentImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public List<EnrollmentAccount> enrollmentAccounts() {
        List<EnrollmentAccount> lst = new ArrayList<EnrollmentAccount>();
        if (this.inner().enrollmentAccounts() != null) {
            for (EnrollmentAccountInner inner : this.inner().enrollmentAccounts()) {
                lst.add( new EnrollmentAccountImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public Enrollment enrollmentDetails() {
        return this.inner().enrollmentDetails();
    }

    @Override
    public Boolean hasReadAccess() {
        return this.inner().hasReadAccess();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<InvoiceSection> invoiceSections() {
        List<InvoiceSection> lst = new ArrayList<InvoiceSection>();
        if (this.inner().invoiceSections() != null) {
            for (InvoiceSectionInner inner : this.inner().invoiceSections()) {
                lst.add( new InvoiceSectionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public BillingAccountImpl withAddress(Address address) {
        this.inner().withAddress(address);
        return this;
    }

    @Override
    public BillingAccountImpl withBillingProfiles(List<BillingProfileInner> billingProfiles) {
        this.inner().withBillingProfiles(billingProfiles);
        return this;
    }

    @Override
    public BillingAccountImpl withDepartments(List<DepartmentInner> departments) {
        this.inner().withDepartments(departments);
        return this;
    }

    @Override
    public BillingAccountImpl withEnrollmentAccounts(List<EnrollmentAccountInner> enrollmentAccounts) {
        this.inner().withEnrollmentAccounts(enrollmentAccounts);
        return this;
    }

    @Override
    public BillingAccountImpl withInvoiceSections(List<InvoiceSectionInner> invoiceSections) {
        this.inner().withInvoiceSections(invoiceSections);
        return this;
    }

}