// SPDX-FileCopyrightText: the secureCodeBox authors
//
// SPDX-License-Identifier: Apache-2.0

package io.securecodebox.persistence.defectdojo;

import lombok.Getter;

public enum ScanType {
    ACUNETIX360_SCAN("Acunetix360 Scan"),
    ACUNETIX_SCAN("Acunetix Scan"),
    ANCHORE_ENGINE_SCAN("Anchore Engine Scan"),
    ANCHORE_ENTERPRISE_POLICY_CHECK("Anchore Enterprise Policy Check"),
    ANCHORE_GRYPE("anchore_grype"),
    API_TEST("API Test"),
    APP_SPIDER_SCAN("AppSpider Scan"),
    AQUA_SCAN("Aqua Scan"),
    ARACHNI_SCAN("Arachni Scan"),
    AUDIT_JS_SCAN("AuditJS Scan"),
    AWS_PROWLER_SCAN("AWS Prowler Scan"),
    AWS_PROWLER_SCANNER("AWS Prowler Scanner"),
    AWS_SCOUT2_SCAN("AWS Scout2 Scan"),
    AWS_SCOUT2_SCANNER("AWS Scout2 Scanner"),
    AWS_SECURITY_HUB_SCAN("AWS Security Hub Scan"),
    BANDIT_SCAN("Bandit Scan"),
    BLACKDUCK_COMPONENT_RISK("Blackduck Component Risk"),
    BLACKDUCK_HUB_SCAN("Blackduck Hub Scan"),
    BRAKEMAN_SCAN("Brakeman Scan"),
    BUG_CROWD("BugCrowd "),
    BUG_CROWD_SCAN("BugCrowd Scan"),
    BUNDLER_AUDIT_SCAN("Bundler-Audit Scan"),
    BURP_ENTERPRISE_SCAN("Burp Enterprise Scan"),
    BURP_REST_API("Burp REST API"),
    BURP_SCAN("Burp Scan"),
    BURP_SUITE_ENTERPRISE("Burp Suite Enterprise"),
    CARGO_AUDIT_SCAN("CargoAudit Scan"),
    CCVS_REPORT("CCVS Report"),
    CHECKMARX_OSA("Checkmarx OSA"),
    CHECKMARX_SCAN("Checkmarx Scan"),
    CHECKMARX_SCAN_DETAILED("Checkmarx Scan detailed"),
    CHECKOV_SCAN("Checkov Scan"),
    CHOCTAW_HOG_SCAN("Choctaw Hog Scan"),
    CLAIR_KLAR_SCAN("Clair Klar Scan"),
    CLAIR_SCAN("Clair Scan"),
    CLOUDSPLOIT_SCAN("Cloudsploit Scan"),
    COBALT_IO_SCAN("Cobalt.io Scan"),
    CONTRAST_SCAN("Contrast Scan"),
    COVERITY_API("Coverity API"),
    CRASHTEST_SECURITY_JSON_FILE("Crashtest Security JSON File"),
    CRASHTEST_SECURITY_SCAN("Crashtest Security Scan"),
    CRASHTEST_SECURITY_XML_FILE("Crashtest Security XML File"),
    CRED_SCAN_SCAN("CredScan Scan"),
    CYCLONE_DX_SCAN("CycloneDX Scan"),
    DAWN_SCANNER_SCAN("DawnScanner Scan"),
    DEPENDENCY_CHECK_SCAN("Dependency Check Scan"),
    DEPENDENCY_TRACK_FINDING_PACKAGING_FORMAT_FPF_EXPORT("Dependency Track Finding Packaging Format (FPF) Export"),
    DETECT_SECRETS_SCAN("Detect-secrets Scan"),
    DOCKLE_SCAN("Dockle Scan"),
    DR_HEADER_JSON_IMPORTER("DrHeader JSON Importer"),
    DSOP_SCAN("DSOP Scan"),
    ES_LINT_SCAN("ESLint Scan"),
    FORTIFY("Fortify"),
    FORTIFY_SCAN("Fortify Scan"),
    GENERIC_FINDINGS_IMPORT("Generic Findings Import"),
    GITHUB_VULNERABILITY_SCAN("Github Vulnerability Scan"),
    GIT_LAB_API_FUZZING_REPORT_SCAN("GitLab API Fuzzing Report Scan"),
    GIT_LAB_CONTAINER_SCAN("GitLab Container Scan"),
    GIT_LAB_DAST_REPORT("GitLab DAST Report"),
    GIT_LAB_DEPENDENCY_SCANNING_REPORT("GitLab Dependency Scanning Report"),
    GIT_LAB_SAST_REPORT("GitLab SAST Report"),
    GIT_LAB_SECRET_DETECTION_REPORT("GitLab Secret Detection Report"),
    GITLEAKS_SCAN("Gitleaks Scan"),
    GOSEC_SCANNER("Gosec Scanner"),
    HACKER_ONE_CASES("HackerOne Cases"),
    HADOLINT_DOCKERFILE_CHECK("Hadolint Dockerfile check"),
    HARBOR_VULNERABILITY_SCAN("Harbor Vulnerability Scan"),
    HUSKY_CI_REPORT("HuskyCI Report"),
    IBM_APP_SCAN_DAST("IBM AppScan DAST"),
    IMMUNIWEB_SCAN("Immuniweb Scan"),
    INT_SIGHTS_REPORT("IntSights Report"),
    J_FROG_XRAY_SCAN("JFrog Xray Scan"),
    J_FROG_XRAY_UNIFIED_SCAN("JFrog Xray Unified Scan"),
    KICS_SCAN("KICS Scan"),
    KIUWAN_SCAN("Kiuwan Scan"),
    KUBE_BENCH_SCAN("kube-bench Scan"),
    MANUAL_CODE_REVIEW("Manual Code Review"),
    METERIAN_SCAN("Meterian Scan"),
    MICROFOCUS_WEBINSPECT_SCAN("Microfocus Webinspect Scan"),
    MOB_SF_SCAN("MobSF Scan"),
    MOB_SF_SCANNER("MobSF Scanner"),
    MOBSFSCAN_SCAN("Mobsfscan Scan"),
    MOZILLA_OBSERVATORY_SCAN("Mozilla Observatory Scan"),
    NESSUS_SCAN("Nessus Scan"),
    NESSUS_WAS_SCAN("Nessus WAS Scan"),
    NETSPARKER_SCAN("Netsparker Scan"),
    NEXPOSE_SCAN("Nexpose Scan"),
    NIKTO_SCAN("Nikto Scan"),
    NMAP_XML_SCAN("Nmap Scan"),
    NODE_SECURITY_PLATFORM_SCAN("Node Security Platform Scan"),
    NPM_AUDIT_SCAN("NPM Audit Scan"),
    NUCLEI_SCAN("Nuclei Scan"),
    OPENSCAP_VULNERABILITY_SCAN("Openscap Vulnerability Scan"),
    OPEN_VAS_CSV("OpenVAS CSV"),
    ORT_EVALUATED_MODEL_IMPORTER("ORT evaluated model Importer"),
    OSS_INDEX_DEVAUDIT_SCA_SCAN_IMPORTER("OssIndex Devaudit SCA Scan Importer"),
    OUTPOST24_SCAN("Outpost24 Scan"),
    PEN_TEST("Pen Test"),
    PHP_SECURITY_AUDIT_V2("PHP Security Audit v2"),
    PHP_SYMFONY_SECURITY_CHECK("PHP Symfony Security Check"),
    PHP_SYMFONY_SECURITY_CHECKER("PHP Symfony Security Checker"),
    PMD_SCAN("PMD Scan"),
    QUALYS_INFRASTRUCTURE_SCAN_WEB_GUI_XML("Qualys Infrastructure Scan (WebGUI XML)"),
    QUALYS_SCAN("Qualys Scan"),
    QUALYS_WEBAPP_SCAN("Qualys Webapp Scan"),
    RETIRE_JS_SCAN("Retire.js Scan"),
    RISK_RECON_API_IMPORTER("Risk Recon API Importer"),
    SAFETY_SCAN("Safety Scan"),
    SARIF("SARIF"),
    SCANTIST_SCAN("Scantist Scan"),
    SCOUT_SUITE_MULTI_CLOUD_SECURITY_AUDITING_TOOL("ScoutSuite Multi-Cloud Security Auditing Tool"),
    SCOUT_SUITE_SCAN("Scout Suite Scan"),
    SECURITY_RESEARCH("Security Research"),
    SEMGREP_JSON_REPORT("Semgrep JSON Report"),
    SKF_SCAN("SKF Scan"),
    SNYK_SCAN("Snyk Scan"),
    SONAR_QUBE("SonarQube"),
    SONAR_QUBE_API_IMPORT("SonarQube API Import"),
    SONAR_QUBE_SCAN("SonarQube Scan"),
    SONAR_QUBE_SCAN_DETAILED("SonarQube Scan detailed"),
    SONATYPE_APPLICATION_SCAN("Sonatype Application Scan"),
    SPOT_BUGS("SpotBugs"),
    SPOT_BUGS_SCAN("SpotBugs Scan"),
    SSL_LABS_SCAN("SSL Labs Scan"),
    SSLSCAN("Sslscan"),
    SSLYZE_JSON_SCAN("SSLyze Scan (JSON)"),
    SSLYZE_SCAN("Sslyze Scan"),
    STATIC_CHECK("Static Check"),
    TERRASCAN_SCAN("Terrascan Scan"),
    TESTSSL_SCAN("Testssl Scan"),
    TF_SEC_SCAN("TFSec Scan"),
    THREAT_MODELING("Threat Modeling"),
    TRIVY_SCAN("Trivy Scan"),
    TRUFFLEHOG("Trufflehog"),
    TRUFFLEHOG3_SCAN("Trufflehog3 Scan"),
    TRUFFLEHOG_SCAN("Trufflehog Scan"),
    TRUSTWAVE("Trustwave"),
    TRUSTWAVE_FUSION_API_SCAN("Trustwave Fusion API Scan"),
    TRUSTWAVE_SCAN_CSV("Trustwave Scan (CSV)"),
    TWISTLOCK_IMAGE_SCAN("Twistlock Image Scan"),
    VCG_SCAN("VCG Scan"),
    VERACODE_SCAN("Veracode Scan"),
    WAPITI_SCAN("Wapiti Scan"),
    WEB_APPLICATION_TEST("Web Application Test"),
    W_FUZZ_JSON_REPORT("WFuzz JSON report"),
    WHITE_HAT_SENTINEL("WhiteHat Sentinel"),
    WHITESOURCE_SCAN("Whitesource Scan"),
    WPSCAN("Wpscan"),
    XANITIZER_SCAN("Xanitizer Scan"),
    YARN_AUDIT_SCAN("Yarn Audit Scan"),
    CODEPECKER("Codepecker JSON Report"),
    ZAP_SCAN("ZAP Scan");

    @Getter
    private final String testType;

    ScanType(String testType) {
        this.testType = testType;
    }
}
