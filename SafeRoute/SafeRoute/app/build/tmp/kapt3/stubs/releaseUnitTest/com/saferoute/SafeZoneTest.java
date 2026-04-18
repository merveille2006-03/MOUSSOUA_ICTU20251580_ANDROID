package com.saferoute;

import com.saferoute.domain.model.LocationData;
import com.saferoute.domain.model.SafeZone;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/saferoute/SafeZoneTest;", "", "()V", "locationData_invalid", "", "locationData_toLatLng", "locationData_valid", "safeZone_defaultActive", "safeZone_defaultRadius", "safeZone_radiusRange", "app_releaseUnitTest"})
public final class SafeZoneTest {
    
    public SafeZoneTest() {
        super();
    }
    
    @org.junit.jupiter.api.Test()
    @org.junit.jupiter.api.DisplayName(value = "Safe zone should have correct default radius")
    public final void safeZone_defaultRadius() {
    }
    
    @org.junit.jupiter.api.Test()
    @org.junit.jupiter.api.DisplayName(value = "Safe zone radius should be within valid range")
    public final void safeZone_radiusRange() {
    }
    
    @org.junit.jupiter.api.Test()
    @org.junit.jupiter.api.DisplayName(value = "Safe zone should be active by default")
    public final void safeZone_defaultActive() {
    }
    
    @org.junit.jupiter.api.Test()
    @org.junit.jupiter.api.DisplayName(value = "Location data should be valid")
    public final void locationData_valid() {
    }
    
    @org.junit.jupiter.api.Test()
    @org.junit.jupiter.api.DisplayName(value = "Invalid location data should be detected")
    public final void locationData_invalid() {
    }
    
    @org.junit.jupiter.api.Test()
    @org.junit.jupiter.api.DisplayName(value = "Location data should convert to LatLng pair")
    public final void locationData_toLatLng() {
    }
}