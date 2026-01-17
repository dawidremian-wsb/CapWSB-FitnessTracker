
package pl.wsb.fitnesstracker.notification;

import lombok.Data;
import pl.wsb.fitnesstracker.training.internal.ActivityType;

import java.util.EnumMap;
import java.util.Map;

@Data
public class WeeklyUserReport {
    private Long userId;
    private String userLabel;               // np. email lub "Imię Nazwisko"
    private int sessions;
    private double totalDistanceKm;
    private long totalDurationMinutes;      // suma minut
    private Double avgPaceMinPerKm;         // min/km (null, jeśli brak dystansu)
    private Map<ActivityType, Long> countByActivity = new EnumMap<>(ActivityType.class);
}