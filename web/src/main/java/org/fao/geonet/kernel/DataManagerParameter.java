package org.fao.geonet.kernel;

import jeeves.resources.dbms.Dbms;
import jeeves.server.context.ServiceContext;

import org.fao.geonet.kernel.reusable.ReusableObjManager;
import org.fao.geonet.kernel.search.SearchManager;
import org.fao.geonet.kernel.setting.SettingManager;
import org.fao.geonet.services.extent.ExtentManager;

public class DataManagerParameter {
	public ServiceContext context;
	public SvnManager svnManager;
	public XmlSerializer xmlSerializer;
	public SchemaManager schemaManager;
	public SearchManager searchManager;
	public AccessManager accessManager;
	public Dbms dbms;
	public SettingManager settingsManager;
	public String baseURL;
	public String dataDir;
	public String thesaurusDir;
	public String appPath;
	
	// GEOCAT
	public ReusableObjManager reusableObjMan;
    public ExtentManager extentMan;
    // GEOCAT

	public DataManagerParameter(ServiceContext context, SvnManager svnManager,
			XmlSerializer xmlSerializer, SchemaManager scm, SearchManager sm,
			AccessManager am, Dbms dbms, SettingManager ss, String baseURL,
			String dataDir, String thesaurusDir, String appPath, 
			ReusableObjManager reusableObjMan, ExtentManager extentMan) {
		this.context = context;
		this.svnManager = svnManager;
		this.xmlSerializer = xmlSerializer;
		this.schemaManager = scm;
		this.searchManager = sm;
		this.accessManager = am;
		this.dbms = dbms;
		this.settingsManager = ss;
		this.baseURL = baseURL;
		this.dataDir = dataDir;
		this.thesaurusDir = thesaurusDir;
		this.appPath = appPath;

		// GEOCAT
        this.reusableObjMan = reusableObjMan;
        this.extentMan = extentMan;
	    // GEOCAT

	}

	public DataManagerParameter() {
	}
	
	
}