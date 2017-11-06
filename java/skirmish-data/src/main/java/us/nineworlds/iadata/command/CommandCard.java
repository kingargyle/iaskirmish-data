package us.nineworlds.iadata.command;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import us.nineworlds.iadata.enums.DeploymentRestrictions;
import us.nineworlds.iadata.enums.Factions;

public class CommandCard {

	@JsonProperty(required=true, value="faction")
	private Factions faction;
	
	@JsonProperty(required=true, value="iaspecName")
	private String iaspecname;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("imageurl")
	private String imageurl;
	
	@JsonProperty("restrictions")
	private List<DeploymentRestrictions> restrictions;
	
	@JsonProperty("cost")
	private int cost;
	
	@JsonProperty("limit")
	private int limit;
	
	@JsonProperty("deployment")
	private String deploymentCard;
	
	@JsonProperty("vendorOptions")
	private Map<String, Object> vendorOptions;
	
	public Factions getFaction() {
		return faction;
	}

	public void setFaction(Factions faction) {
		this.faction = faction;
	}

	public String getIaspecname() {
		return iaspecname;
	}

	public void setIaspecname(String iaspecname) {
		this.iaspecname = iaspecname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public List<DeploymentRestrictions> getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(List<DeploymentRestrictions> restrictions) {
		this.restrictions = restrictions;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getDeploymentCard() {
		return deploymentCard;
	}

	public void setDeploymentCard(String deploymentCard) {
		this.deploymentCard = deploymentCard;
	}

	public Map<String, Object> getVendorOptions() {
		return vendorOptions;
	}

	public void setVendorOptions(Map<String, Object> vendorOptions) {
		this.vendorOptions = vendorOptions;
	}

}
