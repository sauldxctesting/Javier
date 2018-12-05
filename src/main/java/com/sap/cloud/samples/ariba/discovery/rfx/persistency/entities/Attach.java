package com.sap.cloud.samples.ariba.discovery.rfx.persistency.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Product category entity.
 *
 */
@Entity
public class Attach {

	@Id
	@GeneratedValue
	private String id;

	
	private String cid;
	private String fileName;
	private long fileSize;
	private boolean isZip;
	private String uri;
	
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public boolean isZip() {
		return isZip;
	}

	public void setZip(boolean isZip) {
		this.isZip = isZip;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}



	@Override
	public String toString() {
		return "Attachments [cid=" + cid + ", fileName=" + fileName + ", fileSize=" + fileSize
				+ "uri: " + uri +"]";
	}
}
