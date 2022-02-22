## All ID's may specify a namespace (for hooking into common calibers, etc..)
# Pack (/pack.json)

```json5
{
  "name": "PACK_ID", // Name of the pack, used for the namespace of guns/bullets/entities.
  "author": [
    "John Doe <john@example.org>" // Authors in this format.
  ],
  "mod": false // Does it contain java classes that need loading?
}
```

# Gun (/guns/NAME.json)
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

# Bullet (/bullets/NAME.json)
```json5
{
  "name": "BULLET_ID", 
  
  "caliber":  "PACK_ID:caliber",
  "baseDamage": 20.0, // Base damage of the projectile. This data is passed to the entity.
  "baseVelocity": 10.0, // Base velocity in b/s. This data is passed to the entity.
  "baseSpread": 1.0, // Base spread. This data is passed to the entity as well.
  "baseDrag": 0.02, // Base drag in % of velocity per tick. Guess where this goes...
  
  "model": "PACK_ID:model",
  "entity": "PACK_ID:entity"
}
```

# Entity (/entities/NAME.json)
```json5
{
  "name": "ENTITY_ID",
  "class": "org.example.pack.CustomEntity"
}
```

# Model (/models/NAME.json)
```json5
{
  "name": "MODEL_ID",
  "type": "JSON", // Maybe support GeckoLib and/or Java models in the future...,
  "animations": "PACK_ID:animations",
  "texture": "texture", // JSON ONLY
  "data": [{
    "name": "PART_NAME",
    "type": "", // BOX ([x, y, w, h]), TRIANGLES ([ 3*[x, y, z] ]) 
    "data": [],
    "uv": [] // [u, v]
    // PARTS DATA TBA
  }]
}
```

# Animations (/animations/NAME.json)
```json5
{
  "name": "ANIMATIONS_ID",
  "data": {
    "fire": [{
        "time": 0.00, // in seconds
        "part": "example_part",
        "translation": [0.0, 0.0, 0.0],
        "rotation": [0.0, 0.0, 0.0],
        "scale": [0.0, 0.0, 0.0],
        "opacity": 1.0,
        "smooth": "LINEAR"
      }]
  }
}
```

# Attachment
```json5 
{
    "name": "ATTACHMENT_ID",
    "group": "minbal:scope", // Gun.attachments
    "type": "SCOPE", // one of ["SCOPE", "UNDERBARREL", "BARREL", "SIDE", "STOCK"]
    "class": "org.example.pack.CustomAttachment"
}
```
