# Pack
```json5
{
  "name": "PACK_ID", // Id of the pack, used for the namespace of guns/bullets/entities.
  "author": [
    "John Doe <john@example.org>" // Authors in this format.
  ],
  "mod": false // Does it contain java classes that need loading?
}
```

# Gun
```json5
{
  "name" : "gunid", // Id of the gun
  
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

#
