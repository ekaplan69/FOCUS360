package at.sozvers.noegkk.focus.rest.endpoint.constants;

public class RestPaths {

  public static final String APPLICATION_JSON_CHARSET_UTF_8 = "application/json;charset=UTF-8";

  public static final String BASE_REF                        = "/api/rest";
  public static final String COMPLAINT_ENDPOINT              = BASE_REF + "/complaint";
  public static final String CONTACT_ENDPOINT                = BASE_REF + "/contact";
  public static final String CONTACT_NEW_ENDPOINT            = BASE_REF + "/contactnew";
  public static final String DSGVO_ENDPOINT                  = BASE_REF + "/dsgvo";
  public static final String ECARD_ECARDDATEN_ENDPOINT       = BASE_REF + "/ecarddaten";
  public static final String ECMAWF_DOKUMENTE_ENDPOINT       = BASE_REF + "/ecmawf/dokumente";
  public static final String FEEDBACK_ENDPOINT               = BASE_REF + "/feedback";
  public static final String KVA_ANGEHOERIGE_ENDPOINT        = "/angehoerige";
  public static final String KVA_COINSURANCE_ENDPOINT        = BASE_REF + "/coinsurance";
  public static final String KVA_GEBUEHRENBEFREIUNG_ENDPOINT = BASE_REF + "/gebuehrenbefreiung";
  public static final String KVA_KVKERM_ENDPOINT             = BASE_REF + "/kvkerm";
  public static final String KVA_VERSICHERTER_ENDPOINT       = "/versicherte";
  public static final String LEISTUNGEN_ENDPOINT             = BASE_REF + "/leistungen";
  public static final String NOTIZ_ENDPOINT                  = BASE_REF + "/notiz";
  public static final String PATCHNOTES_ENDPOINT             = BASE_REF + "/patchnotes";
  public static final String PATH_ECADMIN_DASHBOARD          = "/ecadmindashboard";
  public static final String PATH_LEISTUNGEN_DASHBOARD       = "/lgkkdashboard";
  public static final String PATH_PARAM_BEARBEITER           = "bearbeiter";
  public static final String PATH_PARAM_FS                   = "fs";
  public static final String PATH_PARAM_FSART                = "fsart";
  public static final String PATH_FS                         = "/{" + PATH_PARAM_FS + "}/{" + PATH_PARAM_FSART + "}";
  public static final String PATH_PARAM_GEBURTSDATUM         = "gebdat";
  /**
   * PATH Params
   */
  public static final String PATH_PARAM_LGK_KEY              = "lgkkey";
  public static final String PATH_PARAM_NACHNAME             = "nachname";
  public static final String PATH_PARAM_NOTIZ                = "notizText";
  public static final String PATH_PARAM_ORG                  = "org";
  public static final String PATH_PARAM_PARTNER_ID           = "partnerId";
  public static final String PATH_PARAM_PID                  = "pid";
  public static final String PATH_LEISTUNGEN                 = "/{" + PATH_PARAM_FS + "}/{" + PATH_PARAM_PID + "}/";
  public static final String PATH_KVKERM                     = "/{" + PATH_PARAM_FS + "}/{" + PATH_PARAM_PID + "}/";
  public static final String PATH_DOKUMENTE                  = "/dokumente/{" + PATH_PARAM_FS + "}/{" + PATH_PARAM_PID + "}/";
  public static final String PATH_DOKUMENT_LESEN             = "/dokumente/lesen/{" + PATH_PARAM_LGK_KEY + "}/{" + PATH_PARAM_PID + "}/";
  public static final String PATH_PARAM_PLZ                  = "plz";
  public static final String PATH_PARAM_PROTID               = "protid";
  public static final String PATH_PARAM_TOKEN                = "token";
  public static final String PATH_PARAM_VORNAME              = "vorname";
  public static final String PATH_PARTNER_ID                 = "/{" + PATH_PARAM_PARTNER_ID + "}";
  public static final String PATH_SEARCH_DOCS                = "/suchen/{" + PATH_PARAM_PID + "}";
  public static final String PATH_SHOW_DOCS                  = "/anzeigen/{" + PATH_PARAM_PID + "}/{" + PATH_PARAM_TOKEN + "}";
  public static final String PATH_UMGEBUNG                   = "/umgebung";
  public static final String PATH_VDA_DASHBOARD              = "/vdadashboard";
  public static final String PATH_ZPV_DASHBOARD              = "/zpvdashboard";
  public static final String QUERY_PARAM_LANDESTSTELLE       = "ls";
  public static final String QUERY_PARAM_MITVERSICHERUNG     = "mv";
  public static final String SYSTEM_ENDPOINT                 = BASE_REF + "/system";
  /**
   * Endpoint URLS
   */
  public static final String USER_ENDPOINT                   = BASE_REF + "/user";
  public static final String ZPV_DIENSTGEBER_ENDPOINT        = BASE_REF + "/dienstgeber";
  public static final String ZPV_INIT_LINK_CC_NEW            = "initlinknew/{" + PATH_PARAM_PID + "}";
  public static final String ZPV_INIT_PARTNER_SUCHEN_CC_NEW  = "initccnew";
  public static final String ZPV_PARTNER_SUCHEN              = "/detail/{" + PATH_PARAM_VORNAME + "}/{" + PATH_PARAM_NACHNAME + "}/{" + PATH_PARAM_PLZ + "}/{" + PATH_PARAM_GEBURTSDATUM + "}";
  public static final String ZPV_PARTNER_SUCHEN_CC_NEW       = "/searchccnew/{" + PATH_PARAM_TOKEN + "}";
  public static final String ZPV_PARTNER_SUCHEN_ORG          = "/detail/{" + PATH_PARAM_ORG + "}/{" + PATH_PARAM_PLZ + "}";
  public static final String ZPV_PERSON_ENDPOINT             = BASE_REF + "/person";
  public static final String ZUP_ENDPOINT                    = BASE_REF + "/zup";
  public static final String ZVD_VERSICHERUNGSZEIT_ENDPOINT  = BASE_REF + "/versicherungszeit";

  private RestPaths() {}
}
