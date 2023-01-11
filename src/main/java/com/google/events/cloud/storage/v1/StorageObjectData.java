/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.cloud.storage.v1;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * An object within Google Cloud Storage.
 */
public class StorageObjectData {
    private String bucket;
    private String cacheControl;
    private Long componentCount;
    private String contentDisposition;
    private String contentEncoding;
    private String contentLanguage;
    private String contentType;
    private String crc32C;
    private CustomerEncryption customerEncryption;
    private String etag;
    private Boolean eventBasedHold;
    private Long generation;
    private String id;
    private String kind;
    private String kmsKeyName;
    private String md5Hash;
    private String mediaLink;
    private Map<String, String> metadata;
    private Long metageneration;
    private String name;
    private OffsetDateTime retentionExpirationTime;
    private String selfLink;
    private Long size;
    private String storageClass;
    private Boolean temporaryHold;
    private OffsetDateTime timeCreated;
    private OffsetDateTime timeDeleted;
    private OffsetDateTime timeStorageClassUpdated;
    private OffsetDateTime updated;

    /**
     * The name of the bucket containing this object.
     */
    public String getBucket() { return bucket; }
    public void setBucket(String value) { this.bucket = value; }

    /**
     * Cache-Control directive for the object data, matching
     * [https://tools.ietf.org/html/rfc7234#section-5.2"][RFC 7234 §5.2].
     */
    public String getCacheControl() { return cacheControl; }
    public void setCacheControl(String value) { this.cacheControl = value; }

    /**
     * Number of underlying components that make up this object. Components are
     * accumulated by compose operations.
     * Attempting to set this field will result in an error.
     */
    public Long getComponentCount() { return componentCount; }
    public void setComponentCount(Long value) { this.componentCount = value; }

    /**
     * Content-Disposition of the object data, matching
     * [https://tools.ietf.org/html/rfc6266][RFC 6266].
     */
    public String getContentDisposition() { return contentDisposition; }
    public void setContentDisposition(String value) { this.contentDisposition = value; }

    /**
     * Content-Encoding of the object data, matching
     * [https://tools.ietf.org/html/rfc7231#section-3.1.2.2][RFC 7231 §3.1.2.2]
     */
    public String getContentEncoding() { return contentEncoding; }
    public void setContentEncoding(String value) { this.contentEncoding = value; }

    /**
     * Content-Language of the object data, matching
     * [https://tools.ietf.org/html/rfc7231#section-3.1.3.2][RFC 7231 §3.1.3.2].
     */
    public String getContentLanguage() { return contentLanguage; }
    public void setContentLanguage(String value) { this.contentLanguage = value; }

    /**
     * Content-Type of the object data, matching
     * [https://tools.ietf.org/html/rfc7231#section-3.1.1.5][RFC 7231 §3.1.1.5].
     * If an object is stored without a Content-Type, it is served as
     * `application/octet-stream`.
     */
    public String getContentType() { return contentType; }
    public void setContentType(String value) { this.contentType = value; }

    /**
     * CRC32c checksum. For more information about using the CRC32c
     * checksum, see
     * [https://cloud.google.com/storage/docs/hashes-etags#_JSONAPI][Hashes and
     * ETags: Best Practices].
     */
    public String getCrc32C() { return crc32C; }
    public void setCrc32C(String value) { this.crc32C = value; }

    /**
     * Metadata of customer-supplied encryption key, if the object is encrypted by
     * such a key.
     */
    public CustomerEncryption getCustomerEncryption() { return customerEncryption; }
    public void setCustomerEncryption(CustomerEncryption value) { this.customerEncryption = value; }

    /**
     * HTTP 1.1 Entity tag for the object. See
     * [https://tools.ietf.org/html/rfc7232#section-2.3][RFC 7232 §2.3].
     */
    public String getEtag() { return etag; }
    public void setEtag(String value) { this.etag = value; }

    /**
     * Whether an object is under event-based hold.
     */
    public Boolean getEventBasedHold() { return eventBasedHold; }
    public void setEventBasedHold(Boolean value) { this.eventBasedHold = value; }

    /**
     * The content generation of this object. Used for object versioning.
     * Attempting to set this field will result in an error.
     */
    public Long getGeneration() { return generation; }
    public void setGeneration(Long value) { this.generation = value; }

    /**
     * The ID of the object, including the bucket name, object name, and
     * generation number.
     */
    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    /**
     * The kind of item this is. For objects, this is always "storage#object".
     */
    public String getKind() { return kind; }
    public void setKind(String value) { this.kind = value; }

    /**
     * Cloud KMS Key used to encrypt this object, if the object is encrypted by
     * such a key.
     */
    public String getKmsKeyName() { return kmsKeyName; }
    public void setKmsKeyName(String value) { this.kmsKeyName = value; }

    /**
     * MD5 hash of the data; encoded using base64 as per
     * [https://tools.ietf.org/html/rfc4648#section-4][RFC 4648 §4]. For more
     * information about using the MD5 hash, see
     * [https://cloud.google.com/storage/docs/hashes-etags#_JSONAPI][Hashes and
     * ETags: Best Practices].
     */
    public String getMd5Hash() { return md5Hash; }
    public void setMd5Hash(String value) { this.md5Hash = value; }

    /**
     * Media download link.
     */
    public String getMediaLink() { return mediaLink; }
    public void setMediaLink(String value) { this.mediaLink = value; }

    /**
     * User-provided metadata, in key/value pairs.
     */
    public Map<String, String> getMetadata() { return metadata; }
    public void setMetadata(Map<String, String> value) { this.metadata = value; }

    /**
     * The version of the metadata for this object at this generation. Used for
     * preconditions and for detecting changes in metadata. A metageneration
     * number is only meaningful in the context of a particular generation of a
     * particular object.
     */
    public Long getMetageneration() { return metageneration; }
    public void setMetageneration(Long value) { this.metageneration = value; }

    /**
     * The name of the object.
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    /**
     * A server-determined value that specifies the earliest time that the
     * object's retention period expires.
     */
    public OffsetDateTime getRetentionExpirationTime() { return retentionExpirationTime; }
    public void setRetentionExpirationTime(OffsetDateTime value) { this.retentionExpirationTime = value; }

    /**
     * The link to this object.
     */
    public String getSelfLink() { return selfLink; }
    public void setSelfLink(String value) { this.selfLink = value; }

    /**
     * Content-Length of the object data in bytes, matching
     * [https://tools.ietf.org/html/rfc7230#section-3.3.2][RFC 7230 §3.3.2].
     */
    public Long getSize() { return size; }
    public void setSize(Long value) { this.size = value; }

    /**
     * Storage class of the object.
     */
    public String getStorageClass() { return storageClass; }
    public void setStorageClass(String value) { this.storageClass = value; }

    /**
     * Whether an object is under temporary hold.
     */
    public Boolean getTemporaryHold() { return temporaryHold; }
    public void setTemporaryHold(Boolean value) { this.temporaryHold = value; }

    /**
     * The creation time of the object.
     * Attempting to set this field will result in an error.
     */
    public OffsetDateTime getTimeCreated() { return timeCreated; }
    public void setTimeCreated(OffsetDateTime value) { this.timeCreated = value; }

    /**
     * The deletion time of the object. Will be returned if and only if this
     * version of the object has been deleted.
     */
    public OffsetDateTime getTimeDeleted() { return timeDeleted; }
    public void setTimeDeleted(OffsetDateTime value) { this.timeDeleted = value; }

    /**
     * The time at which the object's storage class was last changed.
     */
    public OffsetDateTime getTimeStorageClassUpdated() { return timeStorageClassUpdated; }
    public void setTimeStorageClassUpdated(OffsetDateTime value) { this.timeStorageClassUpdated = value; }

    /**
     * The modification time of the object metadata.
     */
    public OffsetDateTime getUpdated() { return updated; }
    public void setUpdated(OffsetDateTime value) { this.updated = value; }
}
