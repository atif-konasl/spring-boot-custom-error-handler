package com.mastering.errorhandler.application.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class BaseDomain implements Serializable {
    private Date created;
    private Date updated;
    private Long version;

    public BaseDomain() { }

    @PrePersist
    protected void onCreate() { this.created = new Date(); }

    @PreUpdate
    protected void onUpdated() { this.updated = new Date(); }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreated() { return this.created; }

    public void setCreated(Date created) { this.created = created; }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getUpdated() { return this.updated; }

    public void setUpdated(Date updated) { this.updated = updated; }

    @Version
    @Access(AccessType.PROPERTY)
    public long getVersion() { return this.version; }

    public void setVersion(long version) { this.version = version; }
}
