## All ID's may specify a namespace (for hooking into common calibers, etc..)
# Pack

```json5
{
  "name": "PACK_ID", // Name of the pack, used for the namespace of guns/bullets/entities.
  "author": [
    "John Doe <john@example.org>" // Authors in this format.
  ],
  "mod": false // Does it contain java classes that need loading?
}
```

# Gun
```json5
{
  "name" : "GUN_ID", // Id of the gun, identifier: PACK_ID:GUN_ID
  
  "caliber": ["PACK_ID:5.56"], // Allowed calibers (Identifier format). Register inter-pack calibers on minbal:*
  "defaultCaliber": null, // If null, chooses first caliber in list. WIP for future.
  
  "rpm": 3600, // Firing rate in RPM
  "firingModes": ["SINGLE", "SEMI"], // Available firing modes from ["SINGLE", "SEMI", "AUTO", "BURST"]
  "firingMode": "SINGLE", // Firing mode. If null, chooses first in list.
  
  "attachments": ["PACK_ID:scopes"], // Same thing as with calibers.
  "sounds": {
    "fire": "PACK_ID:fire",  // Sounds
    "reload": "PACK_ID:fire" // May be extended to more actions in the future. (Unload and load separately)
  },
  
  "rawClass": "org.example.pack.CustomGun" // Only allowed in packs where mod is true.
}
```

# Bullet
```json5
{
  "name": "BULLET_ID", 
  
  "baseDamage": 20.0, // Base damage of the projectile. This data is passed to the entity.
  "baseVelocity": 10.0, // Base velocity in b/s. This data is passed to the entity.
  "baseSpread": 1.0, // Base spread. This data is passed to the entity as well.
  "baseDrag": 0.02, // Base drag in % of velocity per tick. Guess where this goes...
  
  "model": "PACK_ID:model",
  "entity": "PACK_ID:entity"
}
```

# Entity
```json5
{
  "name": "ENTITY_ID",
  "class": "org.example.pack.CustomEntity"
}
```

# Model
```json5
{
  "name": "MODEL_ID",
  "type": "JAVA", // Maybe support GeckoLib models in the future...,
  "data": "org.example.pack.Model"
}
```
