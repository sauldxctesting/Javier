package com.sap.cloud.samples.ariba.discovery.rfx.dtos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Product category DTO.
 *
 */
@XmlRootElement
public class AttachDto {
	
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


	
}
