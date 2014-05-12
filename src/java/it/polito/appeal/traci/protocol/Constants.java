package it.polito.appeal.traci.protocol;

/**
 *       This script contains TraCI constant definitions from
 *       <SUMO_HOME>/src/traci-server/TraCIConstants.h generated by
 *       "rebuildConstants.py" on 2013-04-19 14:24:01.124000.
 * 
 *       SUMO, Simulation of Urban MObility; see http://sumo.sourceforge.net/
 *       Copyright (C) 2009-2012 DLR (http://www.dlr.de/) and contributors All
 *       rights reserved
 */

public class Constants {

	// ****************************************
	// VERSION
	// ****************************************
	public static final int TRACI_VERSION = 5;

	// ****************************************
	// COMMANDS
	// ****************************************
	/** command: get version */
	public static final int CMD_GETVERSION = 0x00;

	/** command: simulation step */
	public static final int CMD_SIMSTEP2 = 0x02;

	/** command: stop node */
	public static final int CMD_STOP = 0x12;

	/** command: set lane */
	public static final int CMD_CHANGELANE = 0x13;

	/** command: slow down */
	public static final int CMD_SLOWDOWN = 0x14;

	/** command: change target */
	public static final int CMD_CHANGETARGET = 0x31;

	/** command: add vehicle */
	public static final int CMD_ADDVEHICLE = 0x74;

	/** command: close sumo */
	public static final int CMD_CLOSE = 0x7F;

	/** command: subscribe induction loop (e1) context */
	public static final int CMD_SUBSCRIBE_INDUCTIONLOOP_CONTEXT = 0x80;
	/** response: subscribe induction loop (e1) context */
	public static final int RESPONSE_SUBSCRIBE_INDUCTIONLOOP_CONTEXT = 0x90;
	/** command: get induction loop (e1) variable */
	public static final int CMD_GET_INDUCTIONLOOP_VARIABLE = 0xa0;
	/** response: get induction loop (e1) variable */
	public static final int RESPONSE_GET_INDUCTIONLOOP_VARIABLE = 0xb0;
	/** command: subscribe induction loop (e1) variable */
	public static final int CMD_SUBSCRIBE_INDUCTIONLOOP_VARIABLE = 0xd0;
	/** response: subscribe induction loop (e1) variable */
	public static final int RESPONSE_SUBSCRIBE_INDUCTIONLOOP_VARIABLE = 0xe0;

	/** command: subscribe areal detector (e3) context */
	public static final int CMD_SUBSCRIBE_MULTI_ENTRY_EXIT_DETECTOR_CONTEXT = 0x81;
	/** response: subscribe areal detector (e3) context */
	public static final int RESPONSE_SUBSCRIBE_MULTI_ENTRY_EXIT_DETECTOR_CONTEXT = 0x91;
	/** command: get multi-entry/multi-exit detector (e3) variable */
	public static final int CMD_GET_MULTI_ENTRY_EXIT_DETECTOR_VARIABLE = 0xa1;
	/** response: get areal detector (e3) variable */
	public static final int RESPONSE_GET_MULTI_ENTRY_EXIT_DETECTOR_VARIABLE = 0xb1;
	/** command: subscribe multi-entry/multi-exit detector (e3) variable */
	public static final int CMD_SUBSCRIBE_MULTI_ENTRY_EXIT_DETECTOR_VARIABLE = 0xd1;
	/** response: subscribe areal detector (e3) variable */
	public static final int RESPONSE_SUBSCRIBE_MULTI_ENTRY_EXIT_DETECTOR_VARIABLE = 0xe1;

	/** command: subscribe traffic lights context */
	public static final int CMD_SUBSCRIBE_TL_CONTEXT = 0x82;
	/** response: subscribe traffic lights context */
	public static final int RESPONSE_SUBSCRIBE_TL_CONTEXT = 0x92;
	/** command: get traffic lights variable */
	public static final int CMD_GET_TL_VARIABLE = 0xa2;
	/** response: get traffic lights variable */
	public static final int RESPONSE_GET_TL_VARIABLE = 0xb2;
	/** command: set traffic lights variable */
	public static final int CMD_SET_TL_VARIABLE = 0xc2;
	/** command: subscribe traffic lights variable */
	public static final int CMD_SUBSCRIBE_TL_VARIABLE = 0xd2;
	/** response: subscribe traffic lights variable */
	public static final int RESPONSE_SUBSCRIBE_TL_VARIABLE = 0xe2;

	/** command: subscribe lane context */
	public static final int CMD_SUBSCRIBE_LANE_CONTEXT = 0x83;
	/** response: subscribe lane context */
	public static final int RESPONSE_SUBSCRIBE_LANE_CONTEXT = 0x93;
	/** command: get lane variable */
	public static final int CMD_GET_LANE_VARIABLE = 0xa3;
	/** response: get lane variable */
	public static final int RESPONSE_GET_LANE_VARIABLE = 0xb3;
	/** command: set lane variable */
	public static final int CMD_SET_LANE_VARIABLE = 0xc3;
	/** command: subscribe lane variable */
	public static final int CMD_SUBSCRIBE_LANE_VARIABLE = 0xd3;
	/** response: subscribe lane variable */
	public static final int RESPONSE_SUBSCRIBE_LANE_VARIABLE = 0xe3;

	/** command: subscribe vehicle context */
	public static final int CMD_SUBSCRIBE_VEHICLE_CONTEXT = 0x84;
	/** response: subscribe vehicle context */
	public static final int RESPONSE_SUBSCRIBE_VEHICLE_CONTEXT = 0x94;
	/** command: get vehicle variable */
	public static final int CMD_GET_VEHICLE_VARIABLE = 0xa4;
	/** response: get vehicle variable */
	public static final int RESPONSE_GET_VEHICLE_VARIABLE = 0xb4;
	/** command: set vehicle variable */
	public static final int CMD_SET_VEHICLE_VARIABLE = 0xc4;
	/** command: subscribe vehicle variable */
	public static final int CMD_SUBSCRIBE_VEHICLE_VARIABLE = 0xd4;
	/** response: subscribe vehicle variable */
	public static final int RESPONSE_SUBSCRIBE_VEHICLE_VARIABLE = 0xe4;

	/** command: subscribe vehicle type context */
	public static final int CMD_SUBSCRIBE_VEHICLETYPE_CONTEXT = 0x85;
	/** response: subscribe vehicle type context */
	public static final int RESPONSE_SUBSCRIBE_VEHICLETYPE_CONTEXT = 0x95;
	/** command: get vehicle type variable */
	public static final int CMD_GET_VEHICLETYPE_VARIABLE = 0xa5;
	/** response: get vehicle type variable */
	public static final int RESPONSE_GET_VEHICLETYPE_VARIABLE = 0xb5;
	/** command: set vehicle type variable */
	public static final int CMD_SET_VEHICLETYPE_VARIABLE = 0xc5;
	/** command: subscribe vehicle type variable */
	public static final int CMD_SUBSCRIBE_VEHICLETYPE_VARIABLE = 0xd5;
	/** response: subscribe vehicle type variable */
	public static final int RESPONSE_SUBSCRIBE_VEHICLETYPE_VARIABLE = 0xe5;

	/** command: subscribe route context */
	public static final int CMD_SUBSCRIBE_ROUTE_CONTEXT = 0x86;
	/** response: subscribe route context */
	public static final int RESPONSE_SUBSCRIBE_ROUTE_CONTEXT = 0x96;
	/** command: get route variable */
	public static final int CMD_GET_ROUTE_VARIABLE = 0xa6;
	/** response: get route variable */
	public static final int RESPONSE_GET_ROUTE_VARIABLE = 0xb6;
	/** command: set route variable */
	public static final int CMD_SET_ROUTE_VARIABLE = 0xc6;
	/** command: subscribe route variable */
	public static final int CMD_SUBSCRIBE_ROUTE_VARIABLE = 0xd6;
	/** response: subscribe route variable */
	public static final int RESPONSE_SUBSCRIBE_ROUTE_VARIABLE = 0xe6;

	/** command: subscribe poi context */
	public static final int CMD_SUBSCRIBE_POI_CONTEXT = 0x87;
	/** response: subscribe poi context */
	public static final int RESPONSE_SUBSCRIBE_POI_CONTEXT = 0x97;
	/** command: get poi variable */
	public static final int CMD_GET_POI_VARIABLE = 0xa7;
	/** response: get poi variable */
	public static final int RESPONSE_GET_POI_VARIABLE = 0xb7;
	/** command: set poi variable */
	public static final int CMD_SET_POI_VARIABLE = 0xc7;
	/** command: subscribe poi variable */
	public static final int CMD_SUBSCRIBE_POI_VARIABLE = 0xd7;
	/** response: subscribe poi variable */
	public static final int RESPONSE_SUBSCRIBE_POI_VARIABLE = 0xe7;

	/** command: subscribe polygon context */
	public static final int CMD_SUBSCRIBE_POLYGON_CONTEXT = 0x88;
	/** response: subscribe polygon context */
	public static final int RESPONSE_SUBSCRIBE_POLYGON_CONTEXT = 0x98;
	/** command: get polygon variable */
	public static final int CMD_GET_POLYGON_VARIABLE = 0xa8;
	/** response: get polygon variable */
	public static final int RESPONSE_GET_POLYGON_VARIABLE = 0xb8;
	/** command: set polygon variable */
	public static final int CMD_SET_POLYGON_VARIABLE = 0xc8;
	/** command: subscribe polygon variable */
	public static final int CMD_SUBSCRIBE_POLYGON_VARIABLE = 0xd8;
	/** response: subscribe polygon variable */
	public static final int RESPONSE_SUBSCRIBE_POLYGON_VARIABLE = 0xe8;

	/** command: subscribe junction context */
	public static final int CMD_SUBSCRIBE_JUNCTION_CONTEXT = 0x89;
	/** response: subscribe junction context */
	public static final int RESPONSE_SUBSCRIBE_JUNCTION_CONTEXT = 0x99;
	/** command: get junction variable */
	public static final int CMD_GET_JUNCTION_VARIABLE = 0xa9;
	/** response: get junction variable */
	public static final int RESPONSE_GET_JUNCTION_VARIABLE = 0xb9;
	/** command: set junction variable */
	public static final int CMD_SET_JUNCTION_VARIABLE = 0xc9;
	/** command: subscribe junction variable */
	public static final int CMD_SUBSCRIBE_JUNCTION_VARIABLE = 0xd9;
	/** response: subscribe junction variable */
	public static final int RESPONSE_SUBSCRIBE_JUNCTION_VARIABLE = 0xe9;

	/** command: subscribe edge context */
	public static final int CMD_SUBSCRIBE_EDGE_CONTEXT = 0x8a;
	/** response: subscribe edge context */
	public static final int RESPONSE_SUBSCRIBE_EDGE_CONTEXT = 0x9a;
	/** command: get edge variable */
	public static final int CMD_GET_EDGE_VARIABLE = 0xaa;
	/** response: get edge variable */
	public static final int RESPONSE_GET_EDGE_VARIABLE = 0xba;
	/** command: set edge variable */
	public static final int CMD_SET_EDGE_VARIABLE = 0xca;
	/** command: subscribe edge variable */
	public static final int CMD_SUBSCRIBE_EDGE_VARIABLE = 0xda;
	/** response: subscribe edge variable */
	public static final int RESPONSE_SUBSCRIBE_EDGE_VARIABLE = 0xea;

	/** command: subscribe simulation context */
	public static final int CMD_SUBSCRIBE_SIM_CONTEXT = 0x8b;
	/** response: subscribe simulation context */
	public static final int RESPONSE_SUBSCRIBE_SIM_CONTEXT = 0x9b;
	/** command: get simulation variable */
	public static final int CMD_GET_SIM_VARIABLE = 0xab;
	/** response: get simulation variable */
	public static final int RESPONSE_GET_SIM_VARIABLE = 0xbb;
	/** command: set simulation variable */
	public static final int CMD_SET_SIM_VARIABLE = 0xcb;
	/** command: subscribe simulation variable */
	public static final int CMD_SUBSCRIBE_SIM_VARIABLE = 0xdb;
	/** response: subscribe simulation variable */
	public static final int RESPONSE_SUBSCRIBE_SIM_VARIABLE = 0xeb;

	/** command: subscribe GUI context */
	public static final int CMD_SUBSCRIBE_GUI_CONTEXT = 0x8c;
	/** response: subscribe GUI context */
	public static final int RESPONSE_SUBSCRIBE_GUI_CONTEXT = 0x9c;
	/** command: get GUI variable */
	public static final int CMD_GET_GUI_VARIABLE = 0xac;
	/** response: get GUI variable */
	public static final int RESPONSE_GET_GUI_VARIABLE = 0xbc;
	/** command: set GUI variable */
	public static final int CMD_SET_GUI_VARIABLE = 0xcc;
	/** command: subscribe GUI variable */
	public static final int CMD_SUBSCRIBE_GUI_VARIABLE = 0xdc;
	/** response: subscribe GUI variable */
	public static final int RESPONSE_SUBSCRIBE_GUI_VARIABLE = 0xec;

	// ****************************************
	// POSITION REPRESENTATIONS
	// ****************************************
	/** Position in geo-coordinates */
	public static final int POSITION_LAT_LON = 0x00;
	/** 2D cartesian coordinates */
	public static final int POSITION_2D = 0x01;
	/** Position in geo-coordinates with altitude */
	public static final int POSITION_LAT_LON_ALT = 0x02;
	/** 3D cartesian coordinates */
	public static final int POSITION_3D = 0x03;
	/** Position on road map */
	public static final int POSITION_ROADMAP = 0x04;

	// ****************************************
	// DATA TYPES
	// ****************************************
	/** Boundary Box (4 doubles) */
	public static final int TYPE_BOUNDINGBOX = 0x05;
	/** Polygon (2*n doubles) */
	public static final int TYPE_POLYGON = 0x06;
	/** unsigned byte */
	public static final int TYPE_UBYTE = 0x07;
	/** signed byte */
	public static final int TYPE_BYTE = 0x08;
	/** 32 bit signed integer */
	public static final int TYPE_INTEGER = 0x09;
	/** float */
	public static final int TYPE_FLOAT = 0x0A;
	/** double */
	public static final int TYPE_DOUBLE = 0x0B;
	/** 8 bit ASCII string */
	public static final int TYPE_STRING = 0x0C;
	/** list of traffic light phases */
	public static final int TYPE_TLPHASELIST = 0x0D;
	/** list of strings */
	public static final int TYPE_STRINGLIST = 0x0E;
	/** compound object */
	public static final int TYPE_COMPOUND = 0x0F;
	/** color (four ubytes) */
	public static final int TYPE_COLOR = 0x11;

	// ****************************************
	// RESULT TYPES
	// ****************************************
	/** result type: Ok */
	public static final int RTYPE_OK = 0x00;
	/** result type: not implemented */
	public static final int RTYPE_NOTIMPLEMENTED = 0x01;
	/** result type: error */
	public static final int RTYPE_ERR = 0xFF;

	/** return value for invalid queries (especially vehicle is not on the road) */
	public static final double INVALID_DOUBLE_VALUE = -1001.;
	/** return value for invalid queries (especially vehicle is not on the road) */
	public static final int INVALID_INT_VALUE = -1;

	// ****************************************
	// TRAFFIC LIGHT PHASES
	// ****************************************
	/** red phase */
	public static final int TLPHASE_RED = 0x01;
	/** yellow phase */
	public static final int TLPHASE_YELLOW = 0x02;
	/** green phase */
	public static final int TLPHASE_GREEN = 0x03;
	/** tl is blinking */
	public static final int TLPHASE_BLINKING = 0x04;
	/** tl is off and not blinking */
	public static final int TLPHASE_NOSIGNAL = 0x05;

	// ****************************************
	// DIFFERENT DISTANCE REQUESTS
	// ****************************************
	/** air distance */
	public static final int REQUEST_AIRDIST = 0x00;
	/** driving distance */
	public static final int REQUEST_DRIVINGDIST = 0x01;

	// ****************************************
	// VEHICLE REMOVAL REASONS
	// ****************************************
	/** vehicle started teleport */
	public static final int REMOVE_TELEPORT = 0x00;
	/** vehicle removed while parking */
	public static final int REMOVE_PARKING = 0x01;
	/** vehicle arrived */
	public static final int REMOVE_ARRIVED = 0x02;
	/** vehicle was vaporized */
	public static final int REMOVE_VAPORIZED = 0x03;
	/** vehicle finished route during teleport */
	public static final int REMOVE_TELEPORT_ARRIVED = 0x04;

	// ****************************************
	// VARIABLE TYPES (for CMD_GET_*_VARIABLE)
	// ****************************************
	/** list of instances' ids (get: all) */
	public static final int ID_LIST = 0x00;

	/** count of instances (get: all) */
	public static final int ID_COUNT = 0x01;

	/** subscribe object variables (get: all) */
	public static final int OBJECT_VARIABLES_SUBSCRIPTION = 0x02;

	/** subscribe context variables (get: all) */
	public static final int SURROUNDING_VARIABLES_SUBSCRIPTION = 0x03;

	/** last step vehicle number (get: induction loops, multi-entry/multi-exit
	    detector, lanes, edges) */
	public static final int LAST_STEP_VEHICLE_NUMBER = 0x10;

	/** last step vehicle number (get: induction loops, multi-entry/multi-exit
	    detector, lanes, edges) */
	public static final int LAST_STEP_MEAN_SPEED = 0x11;

	/** last step vehicle number (get: induction loops, multi-entry/multi-exit
	    detector, lanes, edges) */
	public static final int LAST_STEP_VEHICLE_ID_LIST = 0x12;

	/** last step occupancy (get: induction loops, lanes, edges) */
	public static final int LAST_STEP_OCCUPANCY = 0x13;

	/** last step vehicle halting number (get: multi-entry/multi-exit detector,
	    lanes, edges) */
	public static final int LAST_STEP_VEHICLE_HALTING_NUMBER = 0x14;

	/** last step mean vehicle length (get: induction loops, lanes, edges) */
	public static final int LAST_STEP_LENGTH = 0x15;

	/** last step time since last detection (get: induction loops) */
	public static final int LAST_STEP_TIME_SINCE_DETECTION = 0x16;

	/** entry times */
	public static final int LAST_STEP_VEHICLE_DATA = 0x17;

	/** traffic light states, encoded as rRgGyYoO tuple (get: traffic lights) */
	public static final int TL_RED_YELLOW_GREEN_STATE = 0x20;

	/** index of the phase (set: traffic lights) */
	public static final int TL_PHASE_INDEX = 0x22;

	/** traffic light program (set: traffic lights) */
	public static final int TL_PROGRAM = 0x23;

	/** phase duration (set: traffic lights) */
	public static final int TL_PHASE_DURATION = 0x24;

	/** controlled lanes (get: traffic lights) */
	public static final int TL_CONTROLLED_LANES = 0x26;

	/** controlled links (get: traffic lights) */
	public static final int TL_CONTROLLED_LINKS = 0x27;

	/** index of the current phase (get: traffic lights) */
	public static final int TL_CURRENT_PHASE = 0x28;

	/** name of the current program (get: traffic lights) */
	public static final int TL_CURRENT_PROGRAM = 0x29;

	/** controlled junctions (get: traffic lights) */
	public static final int TL_CONTROLLED_JUNCTIONS = 0x2a;

	/** complete definition (get: traffic lights) */
	public static final int TL_COMPLETE_DEFINITION_RYG = 0x2b;

	/** complete program (set: traffic lights) */
	public static final int TL_COMPLETE_PROGRAM_RYG = 0x2c;

	/** assumed time to next switch (get: traffic lights) */
	public static final int TL_NEXT_SWITCH = 0x2d;

	/** outgoing link number (get: lanes) */
	public static final int LANE_LINK_NUMBER = 0x30;

	/** id of parent edge (get: lanes) */
	public static final int LANE_EDGE_ID = 0x31;

	/** outgoing link definitions (get: lanes) */
	public static final int LANE_LINKS = 0x33;

	/** list of allowed vehicle classes (get&set: lanes) */
	public static final int LANE_ALLOWED = 0x34;

	/** list of not allowed vehicle classes (get&set: lanes) */
	public static final int LANE_DISALLOWED = 0x35;

	/** speed (get: vehicle) */
	public static final int VAR_SPEED = 0x40;

	/** maximum allowed/possible speed (get: vehicle types, lanes, set: edges,
	    lanes) */
	public static final int VAR_MAXSPEED = 0x41;

	/** position (2D) (get: vehicle, poi, set: poi) */
	public static final int VAR_POSITION = 0x42;

	/** angle (get: vehicle) */
	public static final int VAR_ANGLE = 0x43;

	/** angle (get: vehicle types, lanes, set: lanes) */
	public static final int VAR_LENGTH = 0x44;

	/** color (get: vehicles, vehicle types, polygons, pois) */
	public static final int VAR_COLOR = 0x45;

	/** max. acceleration (get: vehicle types) */
	public static final int VAR_ACCEL = 0x46;

	/** max. deceleration (get: vehicle types) */
	public static final int VAR_DECEL = 0x47;

	/** driver reaction time (get: vehicle types) */
	public static final int VAR_TAU = 0x48;

	/** vehicle class (get: vehicle types) */
	public static final int VAR_VEHICLECLASS = 0x49;

	/** emission class (get: vehicle types) */
	public static final int VAR_EMISSIONCLASS = 0x4a;

	/** shape class (get: vehicle types) */
	public static final int VAR_SHAPECLASS = 0x4b;

	/** minimum gap (get: vehicle types) */
	public static final int VAR_MINGAP = 0x4c;

	/** width (get: vehicle types, lanes) */
	public static final int VAR_WIDTH = 0x4d;

	/** shape (get: polygons) */
	public static final int VAR_SHAPE = 0x4e;

	/** type id (get: vehicles, polygons, pois) */
	public static final int VAR_TYPE = 0x4f;

	/** road id (get: vehicles) */
	public static final int VAR_ROAD_ID = 0x50;

	/** lane id (get: vehicles) */
	public static final int VAR_LANE_ID = 0x51;

	/** lane index (get: vehicles) */
	public static final int VAR_LANE_INDEX = 0x52;

	/** route id (get & set: vehicles) */
	public static final int VAR_ROUTE_ID = 0x53;

	/** edges (get: routes) */
	public static final int VAR_EDGES = 0x54;

	/** filled? (get: polygons) */
	public static final int VAR_FILL = 0x55;

	/** position (1D along lane) (get: vehicle) */
	public static final int VAR_LANEPOSITION = 0x56;

	/** route (set: vehicles) */
	public static final int VAR_ROUTE = 0x57;

	/** travel time information (get&set: vehicle) */
	public static final int VAR_EDGE_TRAVELTIME = 0x58;

	/** effort information (get&set: vehicle) */
	public static final int VAR_EDGE_EFFORT = 0x59;

	/** last step travel time (get: edge, lane) */
	public static final int VAR_CURRENT_TRAVELTIME = 0x5a;

	/** signals state (get/set: vehicle) */
	public static final int VAR_SIGNALS = 0x5b;

	/** new lane/position along (set: vehicle) */
	public static final int VAR_MOVE_TO = 0x5c;

	/** driver imperfection (set: vehicle) */
	public static final int VAR_IMPERFECTION = 0x5d;

	/** speed factor (set: vehicle) */
	public static final int VAR_SPEED_FACTOR = 0x5e;

	/** speed deviation (set: vehicle) */
	public static final int VAR_SPEED_DEVIATION = 0x5f;

	/** speed without TraCI influence (get: vehicle) */
	public static final int VAR_SPEED_WITHOUT_TRACI = 0xb1;

	/** best lanes (get: vehicle) */
	public static final int VAR_BEST_LANES = 0xb2;

	/** how speed is set (set: vehicle) */
	public static final int VAR_SPEEDSETMODE = 0xb3;

	/** move vehicle, VTD version (set: vehicle) */
	public static final int VAR_MOVE_TO_VTD = 0xb4;

	/** current CO2 emission of a node (get: vehicle, lane, edge) */
	public static final int VAR_CO2EMISSION = 0x60;

	/** current CO emission of a node (get: vehicle, lane, edge) */
	public static final int VAR_COEMISSION = 0x61;

	/** current HC emission of a node (get: vehicle, lane, edge) */
	public static final int VAR_HCEMISSION = 0x62;

	/** current PMx emission of a node (get: vehicle, lane, edge) */
	public static final int VAR_PMXEMISSION = 0x63;

	/** current NOx emission of a node (get: vehicle, lane, edge) */
	public static final int VAR_NOXEMISSION = 0x64;

	/** current fuel consumption of a node (get: vehicle, lane, edge) */
	public static final int VAR_FUELCONSUMPTION = 0x65;

	/** current noise emission of a node (get: vehicle, lane, edge) */
	public static final int VAR_NOISEEMISSION = 0x66;

	/** current person number (get: vehicle) */
	public static final int VAR_PERSON_NUMBER = 0x67;
	@SuppressWarnings("javadoc")
	public static final int VAR_BUS_STOP_WAITING = 0x67;

	/** current time step (get: simulation) */
	public static final int VAR_TIME_STEP = 0x70;

	/** number of loaded vehicles (get: simulation) */
	public static final int VAR_LOADED_VEHICLES_NUMBER = 0x71;

	/** loaded vehicle ids (get: simulation) */
	public static final int VAR_LOADED_VEHICLES_IDS = 0x72;

	/** number of departed vehicle (get: simulation) */
	public static final int VAR_DEPARTED_VEHICLES_NUMBER = 0x73;

	/** departed vehicle ids (get: simulation) */
	public static final int VAR_DEPARTED_VEHICLES_IDS = 0x74;

	/** number of vehicles starting to teleport (get: simulation) */
	public static final int VAR_TELEPORT_STARTING_VEHICLES_NUMBER = 0x75;

	/** ids of vehicles starting to teleport (get: simulation) */
	public static final int VAR_TELEPORT_STARTING_VEHICLES_IDS = 0x76;

	/** number of vehicles ending to teleport (get: simulation) */
	public static final int VAR_TELEPORT_ENDING_VEHICLES_NUMBER = 0x77;

	/** ids of vehicles ending to teleport (get: simulation) */
	public static final int VAR_TELEPORT_ENDING_VEHICLES_IDS = 0x78;

	/** number of arrived vehicles (get: simulation) */
	public static final int VAR_ARRIVED_VEHICLES_NUMBER = 0x79;

	/** ids of arrived vehicles (get: simulation) */
	public static final int VAR_ARRIVED_VEHICLES_IDS = 0x7a;

	/** delta t (get: simulation) */
	public static final int VAR_DELTA_T = 0x7b;

	/** bounding box (get: simulation) */
	public static final int VAR_NET_BOUNDING_BOX = 0x7c;

	/** minimum number of expected vehicles (get: simulation) */
	public static final int VAR_MIN_EXPECTED_VEHICLES = 0x7d;

	/** add an instance (poi, polygon, vehicle, route) */
	public static final int ADD = 0x80;

	/** remove an instance (poi, polygon) */
	public static final int REMOVE = 0x81;

	/** convert coordinates */
	public static final int POSITION_CONVERSION = 0x82;

	/** distance between points or vehicles */
	public static final int DISTANCE_REQUEST = 0x83;

	/** force rerouting based on travel time (vehicles) */
	public static final int CMD_REROUTE_TRAVELTIME = 0x90;

	/** force rerouting based on effort (vehicles) */
	public static final int CMD_REROUTE_EFFORT = 0x91;

	/** validates current route (vehicles) */
	public static final int VAR_ROUTE_VALID = 0x92;

	/** zoom */
	public static final int VAR_VIEW_ZOOM = 0xa0;

	/** view position */
	public static final int VAR_VIEW_OFFSET = 0xa1;

	/** view schema */
	public static final int VAR_VIEW_SCHEMA = 0xa2;

	/** view by boundary */
	public static final int VAR_VIEW_BOUNDARY = 0xa3;

	/** screenshot */
	public static final int VAR_SCREENSHOT = 0xa5;

	/** track vehicle */
	public static final int VAR_TRACK_VEHICLE = 0xa6;
	
	/** vehicle waiting time */
	public static final int VAR_WAITING_TIME = 122;

	/** lane change mode (change: vehicle state) */
	public static final int CMD_CHANGE_LANE_CHANGE_MODE = 0xb6;

}