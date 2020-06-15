FROM websphere-liberty:kernel

COPY server.xml /config/
COPY target/demo.war /config/dropins/
RUN installUtility install --acceptLicense defaultServer